package com.example.hilttest3.inherritance

import com.example.hilttest3.injected.MyExample
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
open class InheritProdApplication: BaseApplication() {

//    @Inject
//    lateinit var myExample: MyExample

    override fun onCreate() {
        super.onCreate()
//        myExample.test(this::class.java.name)
    }
}