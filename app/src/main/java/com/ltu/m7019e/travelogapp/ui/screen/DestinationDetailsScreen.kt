package com.ltu.m7019e.travelogapp.ui.screen

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ltu.m7019e.travelogapp.model.Destination

@Composable
fun DestinationDetailsScreen(navController: NavController, destination: Destination) {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = destination.name,
            style = androidx.compose.ui.text.TextStyle(
                fontWeight = FontWeight.Bold,  // Make the title bold
                fontSize = 24.sp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = destination.description)
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Read more on Wikipedia",
            modifier = Modifier
                .clickable {
                    // Open the Wikipedia URL in the browser
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(destination.wikiUrl))
                    context.startActivity(intent)  // Start the intent to open the link
                },
            style = androidx.compose.ui.text.TextStyle(
                textDecoration = TextDecoration.Underline
            )
        )

        Spacer(modifier = Modifier.height(16.dp))


        Button(onClick = {
            navController.navigate("destinationMedia/${destination.id}")
        }) {
            Text("View Media")
        }
    }
}
