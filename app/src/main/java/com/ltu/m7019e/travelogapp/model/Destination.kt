package com.ltu.m7019e.travelogapp.model

@Serializable
data class Destination(
    val id: Int,
    val name: String,
    val description: String,
    val country: String,
    val type: String, // e.g., Beach, Culture, Nature
    val location: String, // Can be "latitude,longitude"
    val wikiUrl: String,
    val imageUrl: String,
    val videoUrl: String
)
