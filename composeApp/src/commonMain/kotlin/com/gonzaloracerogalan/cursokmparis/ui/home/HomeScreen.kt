package com.gonzaloracerogalan.cursokmparis.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.gonzaloracerogalan.cursokmparis.ui.core.navigation.bottomnavigation.BottomBarItem
import com.gonzaloracerogalan.cursokmparis.ui.core.navigation.bottomnavigation.NavigationBottomWrapper

@Composable
fun HomeScreen() {
    val items = listOf(
        BottomBarItem.Episodes(),
        BottomBarItem.Characters()
    )
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigation(items, navController) }
    ) { // Content
        Box {
            NavigationBottomWrapper(navController)
        }
    }
}

@Composable
private fun BottomNavigation(items: List<BottomBarItem>, navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                alwaysShowLabel = false,
                label = {
                    Text(item.title)
                },
                icon = item.icon,
                selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}