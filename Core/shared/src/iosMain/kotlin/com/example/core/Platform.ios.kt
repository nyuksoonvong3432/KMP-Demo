package com.example.core

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName()

    override fun getOSVersion(): String {
        return UIDevice.currentDevice.systemVersion
    }
}

actual fun getPlatform(): Platform = IOSPlatform()
actual val num: Int = 2
