package com.main.blockify.main.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.main.blockify.R
import com.main.core.res.theme.DarkColor

@Composable
fun SplashScreen() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkColor),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Image(
            modifier = Modifier.size(400.dp),
            painter = painterResource(id = R.drawable.app_icon_with_background),
            contentDescription = "App Icon",
        )
    }
}
