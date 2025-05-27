package com.ltu.m7019e.travelogapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.ltu.m7019e.travelogapp.data.Destinations
import com.ltu.m7019e.travelogapp.navigation.TravelogNavGraph
import com.ltu.m7019e.travelogapp.ui.theme.TravelogAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelogAppTheme {
                val navController = rememberNavController()

                // Instantiate the Destinations class
                val destinations = Destinations().getDestinations()

                // Pass the navController and destinations list to the NavGraph
                TravelogNavGraph(navController = navController, destinations = destinations)
            }
        }
    }
}

