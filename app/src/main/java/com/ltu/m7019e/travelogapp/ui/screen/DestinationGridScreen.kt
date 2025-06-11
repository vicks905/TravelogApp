package com.ltu.m7019e.travelogapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.ltu.m7019e.travelogapp.model.Destination

@Composable
fun DestinationGridScreen(navController: NavController, destinations: List<Destination>) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "Featured Destinations",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Horizontal scroll section
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(destinations.take(3)) { destination ->
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .clickable {
                            navController.navigate("destinationDetails/${destination.id}")
                        },
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Image(
                            painter = rememberAsyncImagePainter(destination.imageUrl),
                            contentDescription = destination.name,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = destination.name, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Vertical grid section
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize()
        ) {
            items(destinations) { destination ->
                DestinationCard(
                    destinationId = destination.id,
                    navController = navController,
                    destinations = destinations
                )
            }
        }
    }
}

@Composable
fun DestinationCard(destinationId: Int, destinations: List<Destination>, navController: NavController) {
    val destination = destinations.find { it.id == destinationId }
    if (destination != null) {
        Card(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .height(180.dp)
                .clickable {
                    navController.navigate("destinationDetails/${destination.id}")
                },
            shape = RoundedCornerShape(8.dp),
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = rememberAsyncImagePainter(destination.imageUrl),
                    contentDescription = destination.name,
                    modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(8.dp))
                )
                Text(
                    text = destination.name,
                    modifier = Modifier.align(Alignment.BottomCenter).padding(8.dp)
                )
            }
        }
    }
}
