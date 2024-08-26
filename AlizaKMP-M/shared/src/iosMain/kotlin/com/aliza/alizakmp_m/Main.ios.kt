package com.aliza.alizakmp_m

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController { GeneralScreen() }

@Composable
actual fun loadImageResource(resourcePath: String): Painter {
    // Fetch image from main bundle (iOS asset catalog or bundled file)
    val uiImage = UIImage.imageNamed(resourcePath) ?: throw IllegalArgumentException("Image $resourcePath not found")

    // Convert UIImage to Painter using Compose utilities
    return BitmapPainter(uiImage.toComposeImageBitmap())
}
