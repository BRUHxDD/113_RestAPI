package com.example.minggu12

import android.app.Application
import com.example.minggu12.repository.AppContainer
import com.example.minggu12.repository.KontakContainer

class KontakApplication : Application() {
    /** AppContainer instance useb by the res of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}