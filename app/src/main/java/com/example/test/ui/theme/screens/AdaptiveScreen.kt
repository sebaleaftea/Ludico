package com.example.test.ui.theme.screens

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import com.example.test.ui.theme.utils.obtenerWindowSizeClass

@Composable
fun AdaptiveScreen() {

    val windowSizeClass = obtenerWindowSizeClass()

    when (windowSizeClass.widthSizeClass){
        WindowWidthSizeClass.Compact -> {
            HomeScreenCompact()
        }
        WindowWidthSizeClass.Medium->{}
        WindowWidthSizeClass.Expanded->{}

    }
}