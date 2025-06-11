package com.ltu.m7019e.travelogapp.ui.screen

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import java.net.URLDecoder
import java.nio.charset.StandardCharsets


@Composable
fun DestinationMediaScreen(
    navController: NavController,
    videoUrl: String
) {
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Media")
        Spacer(modifier = Modifier.height(8.dp))

        val decodedUrl = URLDecoder.decode(videoUrl, StandardCharsets.UTF_8.toString())
        val videoId = decodedUrl.split("v=")[1]

        val youtubeUrl = "https://www.youtube.com/watch?v=$videoId"

        AndroidView(
            factory = { context ->
                WebView(context).apply {
                    webViewClient = WebViewClient()  // Make sure links open in WebView
                    settings.javaScriptEnabled = true // Enable JavaScript for YouTube video to work
                    loadUrl(youtubeUrl)  // Load the YouTube video URL
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(8.dp)
        )
    }
}




