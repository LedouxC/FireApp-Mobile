package isen.fire.fireapp.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ItineraryScreen() {
    val itineraries = listOf("Mont Faron - Nord", "Parcours Sud")
    val selected = remember { mutableStateOf("") }
    val altitude = remember { mutableStateOf(100) }
    val distance = remember { mutableStateOf(1500) }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = selected.value,
            onValueChange = { selected.value = it },
            label = { Text("Itinéraire") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(modifier = Modifier.height(120.dp)) {
            items(itineraries) {
                Text(text = it)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Altitude: ${altitude.value} m")
        Text("Distance: ${distance.value} m")
        Spacer(modifier = Modifier.height(16.dp))
        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = { /* Sauvegarder */ }) {
                Text("Sauvegarder")
            }
            Button(onClick = { /* Supprimer */ }, colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)) {
                Text("Supprimer")
            }
        }
    }
}