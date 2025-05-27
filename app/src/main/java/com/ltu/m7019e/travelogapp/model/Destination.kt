package com.ltu.m7019e.travelogapp.model

import kotlinx.serialization.Serializable

@Serializable
data class Destination(
    val id: Int,
    val name: String,
    val description: String,
    val country: String,
    val location: String,
    val type: String,
    val wikiUrl: String,
    val imageUrl: String,
    val videoUrl: String
)