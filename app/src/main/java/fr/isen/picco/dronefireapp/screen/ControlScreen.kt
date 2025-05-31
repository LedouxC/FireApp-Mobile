package fr.isen.picco.dronefireapp.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import fr.isen.picco.dronefireapp.ui.components.BottomNavigationBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ControlScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController, current = "control")
        }
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Piloter", style = MaterialTheme.typography.headlineSmall)
        }
    }
}

