package com.ltu.m7019e.travelogapp.network

// Response class
data class YoutubeSearchResponse(
    val items: List<YouTubeVideoItem>
)

// Video item class
data class YouTubeVideoItem(
    val id: YouTubeVideoId,
    val snippet: YouTubeVideoSnippet
)

// Video ID class
data class YouTubeVideoId(
    val videoId: String // The video ID that we need to construct the URL
)

// Snippet class contains title, description, and thumbnails
data class YouTubeVideoSnippet(
    val title: String,
    val description: String,
    val thumbnails: YouTubeThumbnail
)

// Thumbnail class for the video
data class YouTubeThumbnail(
    val medium: YouTubeThumbnailDetails
)

// Thumbnail details
data class YouTubeThumbnailDetails(
    val url: String
)
