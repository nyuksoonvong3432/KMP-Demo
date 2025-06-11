package com.example.spacetutorial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
expect suspend fun getSomethingAsync(): String