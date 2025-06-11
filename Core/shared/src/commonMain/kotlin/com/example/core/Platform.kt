package com.example.core

interface Platform {
    val name: String

    fun getOSVersion(): String
}

class ServerConfig(baseURL: String) {

}

expect fun getPlatform(): Platform
expect val num: Int