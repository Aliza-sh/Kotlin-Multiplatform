package com.aliza.alizakmp_m

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

@Composable
actual fun loadImageResource(resourcePath: String): Painter {
    val context = LocalContext.current
    val resourceId = context.resources.getIdentifier(resourcePath, "drawable", context.packageName)
    return painterResource(resourceId)
}