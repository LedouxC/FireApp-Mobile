package isen.fire.fireapp.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ControlScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Interface de pilotage du drone")
        Spacer(modifier = Modifier.height(16.dp))
        Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { /* Takeoff */ }) { Text("Décoller") }
            Button(onClick = { /* Land */ }) { Text("Atterrir") }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { /* LED ON */ }) { Text("LED ON") }
            Button(onClick = { /* LED OFF */ }) { Text("LED OFF") }
        }
    }
}
