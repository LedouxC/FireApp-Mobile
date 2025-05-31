package fr.isen.picco.dronefireapp.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.FlightTakeoff
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.isen.picco.dronefireapp.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = Color(0xFFA9A9A9) // Vert clair
            ) {
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("home") },
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Accueil") },
                    label = { Text("Accueil") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("route") },
                    icon = { Icon(Icons.Filled.Map, contentDescription = "Itinéraire") },
                    label = { Text("Itinéraire") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("report") },
                    icon = { Icon(Icons.Filled.Article, contentDescription = "Rapports") },
                    label = { Text("Rapports") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("control") },
                    icon = { Icon(Icons.Filled.FlightTakeoff, contentDescription = "Piloter") },
                    label = { Text("Piloter") }
                )
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "FIRE App",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(24.dp))

                Image(
                    painter = painterResource(id = R.drawable.logo_fire), // remplace par ton image
                    contentDescription = "Logo de FIRE App",
                    modifier = Modifier
                        .height(400.dp)
                        .width(400.dp)
                )
            }
        }
    }
}
