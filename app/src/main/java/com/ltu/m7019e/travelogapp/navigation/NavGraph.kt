package com.ltu.m7019e.travelogapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ltu.m7019e.travelogapp.model.Destination
import com.ltu.m7019e.travelogapp.ui.screen.DestinationDetailsScreen
import com.ltu.m7019e.travelogapp.ui.screen.DestinationGridScreen
import com.ltu.m7019e.travelogapp.ui.screen.DestinationMediaScreen

@Composable
fun TravelogNavGraph(navController: NavHostController, destinations: List<Destination>) {
    NavHost(navController = navController, startDestination = "destinationGrid") {
        composable("destinationGrid") {
            DestinationGridScreen(navController, destinations)
        }

        composable("destinationDetails/{destinationId}") { backStackEntry ->
            val destinationId = backStackEntry.arguments?.getString("destinationId")?.toInt()
            val destination = destinations.find { it.id == destinationId }
            if (destination != null) {
                DestinationDetailsScreen(navController, destination)
            }
        }

        composable("destinationMedia/{destinationId}") { backStackEntry ->
            val destinationId = backStackEntry.arguments?.getString("destinationId")?.toInt()
            val destination = destinations.find { it.id == destinationId }
            if (destination != null) {
                DestinationMediaScreen(destination)
            }
        }
    }
}

