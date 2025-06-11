package com.example.core

class AndroidPlatform : Platform {
    override val name: String = "Android"

    override fun getOSVersion(): String {
        return "${android.os.Build.VERSION.SDK_INT}"
    }
}

actual fun getPlatform(): Platform = AndroidPlatform()
actual val num: Int = 1
