package com.ltu.m7019e.travelogapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ltu.m7019e.travelogapp.model.Destination
import com.ltu.m7019e.travelogapp.network.YouTubeApiClient
import com.ltu.m7019e.travelogapp.network.YoutubeSearchResponse
import com.ltu.m7019e.travelogapp.utils.SECRETS
import kotlinx.coroutines.suspendCancellableCoroutine
import retrofit2.Callback
import retrofit2.Call
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException


class DestinationViewModel : ViewModel() {
    private val _destinations = mutableListOf<Destination>()

    private val videoCache = mutableMapOf<String, String>()

    fun getDestinationVideo(destinationName: String) = liveData {
        try {
            val cachedUrl = videoCache[destinationName]
            if (cachedUrl != null) {
                emit(cachedUrl)
            } else {
                val videoUrl = getYouTubeVideo(destinationName + "tourism travel guide")
                videoCache[destinationName] = videoUrl ?: "No video found"
                emit(videoUrl ?: "No video found")
            }
        } catch (e: Exception) {
            emit("Error: ${e.message}")
        }
    }

    // Helper function to make the YouTube API call
    private suspend fun getYouTubeVideo(destinationName: String): String? {
        return suspendCancellableCoroutine { continuation ->
            YouTubeApiClient.apiService.searchVideos(query = destinationName, apiKey = SECRETS.API_KEY)
                .enqueue(object : Callback<YoutubeSearchResponse> {
                    override fun onResponse(call: Call<YoutubeSearchResponse>, response: Response<YoutubeSearchResponse>) {
                        if (response.isSuccessful) {
                            val videoUrl = response.body()?.items?.get(0)?.id?.videoId?.let {
                                "https://www.youtube.com/watch?v=$it"
                            }
                            continuation.resume(videoUrl)
                        } else {
                            continuation.resumeWithException(Exception("Error: ${response.message()}"))
                        }
                    }

                    override fun onFailure(call: Call<YoutubeSearchResponse>, t: Throwable) {
                        continuation.resumeWithException(t)
                    }
                })
        }
    }
}