package com.main.blockify.main.domain.navigation.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.main.core.res.theme.DarkColor

@Composable
fun MainNavigationGraph(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(navController = navController, startDestination = MainNavigationGraphRoutes.TRACKING_SCREEN) {
        composable(MainNavigationGraphRoutes.TRACKING_SCREEN) {
            Box(modifier = Modifier.fillMaxSize().background(DarkColor)) {
                Text(text = "Something")
            }
        }
    }
}

object MainNavigationGraphRoutes {
    const val TRACKING_SCREEN = "tracking_screen"
}
