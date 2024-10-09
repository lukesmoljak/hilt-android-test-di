package com.example.hilttest3.inherritance

import android.app.Application
import com.example.hilttest3.injected.MyExample
import dagger.hilt.android.HiltAndroidApp

//@HiltAndroidApp
open class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}