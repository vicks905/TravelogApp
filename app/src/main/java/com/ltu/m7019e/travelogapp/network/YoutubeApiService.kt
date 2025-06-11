package com.ltu.m7019e.travelogapp.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YoutubeApiService {
    @GET("search")
    fun searchVideos(
        @Query("part") part: String = "snippet",  // The parts of the video resource to retrieve
        @Query("q") query: String,                // The search query (destination name)
        @Query("key") apiKey: String,             // YouTube API key
        @Query("maxResults") maxResults: Int = 1  // Number of results (videos) to return
    ): Call<YoutubeSearchResponse>
}