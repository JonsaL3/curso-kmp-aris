package com.gonzaloracerogalan.cursokmparis

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform