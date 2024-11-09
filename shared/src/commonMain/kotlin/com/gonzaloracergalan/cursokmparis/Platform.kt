package com.gonzaloracergalan.cursokmparis

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform