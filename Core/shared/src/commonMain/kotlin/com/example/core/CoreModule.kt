package com.example.core

class CoreModule {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val platform = platform
        return "OS version for ${platform.name}, version is ${platform.getOSVersion()}, num is $num"
    }

    fun getFacilities(): Array<String> {
        return arrayOf("Facility A", "Facility B")
    }
}