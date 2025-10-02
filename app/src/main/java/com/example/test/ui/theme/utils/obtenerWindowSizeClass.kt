package com.example.test.ui.theme.utils

import android.app.Activity
import android.view.Window
import androidx.compose.runtime.Composable
import androidx.compose.material3.*
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material3.windowsizeclass.WindowSizeClass
@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun obtenerWindowSizeClass(): WindowSizeClass  {
    val configuration = LocalConfiguration.current
    return calculateWindowSizeClass(activity = LocalContext.current as Activity)
}