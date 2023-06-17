package com.main.blockify.core.presentation.theme

import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.main.core.res.theme.DarkColor
import com.main.core.res.theme.InputErrorColor
import com.main.core.res.theme.MalibuLightColor

@Composable
fun authButtonColors(): TextFieldColors {
    return TextFieldDefaults.textFieldColors(
        textColor = Color.White,
        backgroundColor = DarkColor,
        focusedIndicatorColor = MalibuLightColor,
        focusedLabelColor = Color.White,
        unfocusedLabelColor = Color.White,
        unfocusedIndicatorColor = Color(0xFF9C9DA2),
        cursorColor = MalibuLightColor,
        errorIndicatorColor = InputErrorColor,
        errorLabelColor = Color.White,
        errorCursorColor = Color.White,
    )
}
