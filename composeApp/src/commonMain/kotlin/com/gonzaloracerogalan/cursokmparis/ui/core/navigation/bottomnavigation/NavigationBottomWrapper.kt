package com.gonzaloracerogalan.cursokmparis.ui.core.navigation.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gonzaloracerogalan.cursokmparis.ui.core.navigation.Routes
import com.gonzaloracerogalan.cursokmparis.ui.home.tab.character.CharacterScreen
import com.gonzaloracerogalan.cursokmparis.ui.home.tab.episode.EpisodeScreen

@Composable
fun NavigationBottomWrapper(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Episodes.route) {
        composable(route = Routes.Episodes.route) {
            EpisodeScreen()
        }
        composable(route = Routes.Characters.route) {
            CharacterScreen()
        }
    }
}