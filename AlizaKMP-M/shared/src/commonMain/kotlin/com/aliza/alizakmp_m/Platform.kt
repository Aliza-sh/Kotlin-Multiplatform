package com.aliza.alizakmp_m

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform