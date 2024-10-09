package com.example.hilttest3

import android.app.Application
import com.example.hilttest3.injected.MyExample
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

//@HiltAndroidApp
class MyApplication: Application() {

    @Inject
    lateinit var myExampleImpl: MyExample

    override fun onCreate() {
        super.onCreate()
        println("LUKE: APP INIT HASHCODE: ${myExampleImpl.hashCode()}")
    }

}