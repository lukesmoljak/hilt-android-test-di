package com.example.hilttest3.inheritance

import com.example.hilttest3.MyApplication
import com.example.hilttest3.inherritance.BaseApplication
import com.example.hilttest3.inherritance.InheritProdApplication
import com.example.hilttest3.injected.MyExample
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.testing.CustomTestApplication

@CustomTestApplication(BaseApplication::class)
interface HiltTestApp