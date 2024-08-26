package com.aliza.alizakmp_m


import androidx.compose.ui.graphics.ImageBitmap
import platform.CoreGraphics.CGImageGetHeight
import platform.CoreGraphics.CGImageGetWidth
import platform.CoreGraphics.CGRectMake
import platform.CoreGraphics.CGSizeMake
import platform.UIKit.UIGraphicsBeginImageContextWithOptions
import platform.UIKit.UIGraphicsEndImageContext
import platform.UIKit.UIGraphicsGetImageFromCurrentImageContext
import platform.UIKit.UIImage
import platform.UIKit.drawInRect

fun UIImage.toComposeImageBitmap(): ImageBitmap {
    val size = CGSizeMake(CGImageGetWidth(this.CGImage).toDouble(), CGImageGetHeight(this.CGImage).toDouble())
    UIGraphicsBeginImageContextWithOptions(size, false, 1.0)
    this.drawInRect(CGRectMake(0.0, 0.0, size.width, size.height))
    val result = UIGraphicsGetImageFromCurrentImageContext()
    UIGraphicsEndImageContext()
    return result!!.asImageBitmap()
}
