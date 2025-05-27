package com.ltu.m7019e.travelogapp.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ltu.m7019e.travelogapp.model.Destination

@Composable
fun DestinationDetailsScreen(navController: NavController, destination: Destination) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = destination.name)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = destination.description)
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate("destinationMedia/${destination.id}")
        }) {
            Text("View Media")
        }
    }
}
