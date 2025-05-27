package com.ltu.m7019e.travelogapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.ltu.m7019e.travelogapp.model.Destination

@Composable
fun DestinationGridScreen(navController: NavController, destinations: List<Destination>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        items(destinations) {destination ->
            // Pass only destination.id to the DestinationCard
            DestinationCard(destinationId = destination.id, navController = navController, destinations = destinations)
        }
    }
}

@Composable
fun DestinationCard(destinationId: Int, destinations: List<Destination>, navController: NavController) {
    // Find the destination object based on the destinationId
    val destination = destinations.find { it.id == destinationId }

    // Ensure the destination object exists
    if (destination != null) {
        Card(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .height(180.dp)
                .clickable {
                    // Navigate using the destinationId
                    navController.navigate("destinationDetails/${destination.id}")
                },
            shape = RoundedCornerShape(8.dp),
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                // Display the image and name of the destination
                Image(
                    painter = rememberImagePainter(destination.imageUrl),
                    contentDescription = destination.name,
                    modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(8.dp))
                )
                Text(
                    text = destination.name,
                    modifier = Modifier.align(Alignment.BottomCenter).padding(16.dp)
                )
            }
        }
    }
}

