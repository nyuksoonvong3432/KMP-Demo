//
//  KMPIosAppApp.swift
//  KMPIosApp
//
//  Created by nyuksoon.vong on 11/6/25.
//

import SwiftUI
import shared

@main
struct KMPIosAppApp: App {
    let helper: KoinHelper = KoinHelper()
    
    init() {
        helper.doInitKoin()
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
                .task {
                    let launches = try? await helper.getLaunches(forceReload: true)
                    print(launches)
                }
        }
    }
}
