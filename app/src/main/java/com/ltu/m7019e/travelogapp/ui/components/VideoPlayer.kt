package com.ltu.m7019e.travelogapp.ui.components

import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import androidx.compose.ui.platform.LocalContext
import androidx.media3.common.MediaItem

@Composable
fun VideoPlayer(videoUrl: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    // Create ExoPlayer instance
    val player = remember {
        ExoPlayer.Builder(context).build().apply {
            val mediaItem = MediaItem.fromUri(Uri.parse(videoUrl))  // Correct usage of MediaItem
            setMediaItem(mediaItem)
            prepare()
            playWhenReady = false
        }
    }

    // Clean up ExoPlayer when no longer in use
    DisposableEffect(Unit) {
        onDispose { player.release() }
    }

    // Embed PlayerView (ExoPlayer UI component)
    AndroidView(
        factory = { PlayerView(it).apply { this.player = player } },
        modifier = modifier
            .fillMaxWidth()
            .height(250.dp)  // Adjusted height to fit your screen better
            .padding(8.dp)
    )
}