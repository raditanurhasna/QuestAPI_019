package com.example.pertemuan12.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan12.ui.theme.viewmahasiswa.DestinasiEntry
import com.example.pertemuan12.ui.theme.viewmahasiswa.DestinasiHome
import com.example.pertemuan12.ui.theme.viewmahasiswa.EntryMhsScreen
import com.example.pertemuan12.ui.theme.viewmahasiswa.HomeScreen

@Composable
fun PengelolaHalaman(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {navController.navigate(DestinasiEntry.route)},
                onDetailClick = {}
            )
        }
        composable(DestinasiEntry.route) {
            EntryMhsScreen(navigateBack = {
                navController.navigate(DestinasiHome.route) {
                    popUpTo(DestinasiHome.route) {
                        inclusive = true
                    }
                }
            })
        }
    }
}