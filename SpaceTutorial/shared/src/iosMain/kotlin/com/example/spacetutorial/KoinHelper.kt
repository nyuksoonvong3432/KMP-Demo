package com.example.spacetutorial

import org.koin.core.component.KoinComponent
import com.example.spacetutorial.entities.RocketLaunch
import com.example.spacetutorial.network.SpaceXApi
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.dsl.module

class KoinHelper : KoinComponent {
    private val sdk: SpaceXSDK by inject<SpaceXSDK>()

    fun initKoin() {
       startKoin {
           modules(module {
               single<SpaceXApi> { SpaceXApi() }
               single<SpaceXSDK> { SpaceXSDK(api = get() )}
           })
       }
    }

    suspend fun getLaunches(forceReload: Boolean): List<RocketLaunch> {
        return sdk.getLaunches()
    }
}
