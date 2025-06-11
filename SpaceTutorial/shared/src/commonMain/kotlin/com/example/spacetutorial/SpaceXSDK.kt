package com.example.spacetutorial

import com.example.spacetutorial.entities.RocketLaunch
import com.example.spacetutorial.network.SpaceXApi

class SpaceXSDK(val api: SpaceXApi) {
    suspend fun getLaunches(): List<RocketLaunch> {
        return api.getAllLaunches()
    }
}