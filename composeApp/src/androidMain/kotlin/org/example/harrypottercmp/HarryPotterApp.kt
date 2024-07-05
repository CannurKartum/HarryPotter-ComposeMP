package org.example.harrypottercmp

import android.app.Application
import di.initKoin

class HarryPotterApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}