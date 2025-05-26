package isen.fire.fireapp.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BatteryChargingFull
import androidx.compose.material.icons.filled.FireExtinguisher
import androidx.compose.material.icons.filled.Route
import androidx.compose.material.icons.filled.Terrain
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ReportScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Rapport du drone 1 - 21/11/2024 11:48")
        Spacer(modifier = Modifier.height(16.dp))
        Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
            StatCard("1.5 km", Icons.Default.Route)
            StatCard("100 m", Icons.Default.Terrain)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
            StatCard("11 (low)", Icons.Default.FireExtinguisher)
            StatCard("15%", Icons.Default.BatteryChargingFull)
        }
    }
}