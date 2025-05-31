package fr.isen.picco.dronefireapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomNavigationBar(navController: NavController, current: String) {
    NavigationBar {
        NavigationBarItem(
            selected = current == "home",
            onClick = { navController.navigate("home") },
            icon = { Icon(Icons.Filled.Home, contentDescription = "Accueil") },
            label = { Text("Accueil") }
        )
        NavigationBarItem(
            selected = current == "route",
            onClick = { navController.navigate("route") },
            icon = { Icon(Icons.Filled.Map, contentDescription = "Itinéraire") },
            label = { Text("Itinéraire") }
        )
        NavigationBarItem(
            selected = current == "report",
            onClick = { navController.navigate("report") },
            icon = { Icon(Icons.Filled.Article, contentDescription = "Rapports") },
            label = { Text("Rapports") }
        )
        NavigationBarItem(
            selected = current == "control",
            onClick = { navController.navigate("control") },
            icon = { Icon(Icons.Filled.FlightTakeoff, contentDescription = "Piloter") },
            label = { Text("Piloter") }
        )
    }
}