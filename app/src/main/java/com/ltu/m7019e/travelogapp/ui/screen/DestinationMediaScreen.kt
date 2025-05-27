package com.ltu.m7019e.travelogapp.ui.screen

import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.ltu.m7019e.travelogapp.model.Destination

@Composable
fun DestinationMediaScreen(destination: Destination) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Media for ${destination.name}")
        Spacer(modifier = Modifier.height(8.dp))

        val player = ExoPlayer.Builder(LocalContext.current).build()
        val mediaItem = MediaItem.fromUri(Uri.parse(destination.videoUrl))
        player.setMediaItem(mediaItem)
        player.prepare()

        AndroidView(
            factory = {
                PlayerView(it).apply {
                    this.player = player
                }
            },
            modifier = Modifier.fillMaxWidth().height(300.dp)
        )
    }
}




