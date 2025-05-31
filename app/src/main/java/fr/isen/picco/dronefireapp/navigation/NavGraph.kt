package fr.isen.picco.dronefireapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.isen.picco.dronefireapp.screen.ControlScreen
import fr.isen.picco.dronefireapp.screen.HomeScreen
import fr.isen.picco.dronefireapp.screen.RouteScreen
import fr.isen.picco.dronefireapp.screen.ReportScreen

@Composable
    fun NavGraph(navController: NavHostController = rememberNavController()) {
        NavHost(navController, startDestination = "home") {
            composable("home") { HomeScreen(navController) }
            composable("route") { RouteScreen(navController) }
            composable("report") { ReportScreen(navController) }
            composable("control") { ControlScreen(navController) }
        }
    }