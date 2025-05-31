package fr.isen.picco.dronefireapp.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import fr.isen.picco.dronefireapp.ui.components.BottomNavigationBar
import androidx.compose.foundation.lazy.items

data class Report(
    val date: String,
    val distanceKm: Double,
    val maxAltitude: Double,
    val averageSpeed: Double
)

val reportList = listOf(
    Report("30/05/2025", 12.5, 240.0, 32.0),
    Report("28/05/2025", 9.2, 180.0, 28.4),
    Report("25/05/2025", 15.8, 270.0, 36.1)
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")

@Composable
fun ReportScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController, current = "report")
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                "Historique des Rapports:",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            LazyColumn {
                items(reportList) { report ->
                    ReportCard(report = report, onClick = {
                        // Action au clic, ex: navController.navigate("detail/${report.id}")
                    })
                }
            }
        }
    }

}

@Composable
fun ReportCard(report: Report, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE8F5E9) // Vert très clair
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Date : ${report.date}", style = MaterialTheme.typography.titleMedium)
            Text("Distance : ${report.distanceKm} km")
            Text("Altitude max : ${report.maxAltitude} m")
            Text("Vitesse moyenne : ${report.averageSpeed} km/h")
        }
    }
}
