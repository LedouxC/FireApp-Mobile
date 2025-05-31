package fr.isen.picco.dronefireapp.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import fr.isen.picco.dronefireapp.ui.components.BottomNavigationBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ReportScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController, current = "report")
        }
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
            Text("Historique des Rapports:", style = MaterialTheme.typography.headlineSmall)
        }
    }
}
