package com.ltu.m7019e.travelogapp.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object DestinationDetails : Screen("details/{destinationId}") {
        fun createRoute(destinationId: Long) = "details/$destinationId"
    }
    object MediaScreen : Screen("media/{destinationId}") {
        fun createRoute(destinationId: Long) = "media/$destinationId"
    }
}
