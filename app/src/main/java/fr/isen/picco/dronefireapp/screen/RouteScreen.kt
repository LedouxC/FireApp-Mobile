package fr.isen.picco.dronefireapp.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import fr.isen.picco.dronefireapp.R
import fr.isen.picco.dronefireapp.ui.components.BottomNavigationBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RouteScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController, current = "route")
        }
    ) {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
            Text(text = "Choix d'Itinéraire:", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp), // Optionnel: ajoute un peu d'espace autour
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.image_carte),
                contentDescription = "Carte Toulon",
                modifier = Modifier
                    .height(400.dp)
                    .width(400.dp)
            )
        }
    }
}
