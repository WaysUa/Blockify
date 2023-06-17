package com.main.blockify.main.domain.navigation.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.main.blockify.features.onboarding.presentation.ui.screen.OnBoardingScreen
import com.main.blockify.main.domain.navigation.main.MainNavigationGraph
import com.main.blockify.main.presentation.ui.SplashScreen

@Composable
fun RootNavigationGraph(
    navController: NavHostController,
    startDestination: String = RootNavigationGraphRoutes.SPLASH,
) {
    NavHost(
        navController = navController,
        route = "root_graph",
        startDestination = startDestination,
    ) {
        composable(route = RootNavigationGraphRoutes.SPLASH) {
            SplashScreen()
        }
        composable(route = RootNavigationGraphRoutes.ON_BOARDING) {
            OnBoardingScreen(
                popBackStack = {
                    navController.popBackStack()
                },
            )
        }
        composable(route = RootNavigationGraphRoutes.MAIN) {
            MainNavigationGraph()
        }
    }
}

object RootNavigationGraphRoutes {
    const val MAIN = "main_graph"
    const val ON_BOARDING = "on_boarding_graph"
    const val SPLASH = "splash_screen_graph"
}
