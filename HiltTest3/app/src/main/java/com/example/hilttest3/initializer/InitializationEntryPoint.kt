package com.example.hilttest3.initializer

import com.example.hilttest3.injected.MyExample
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface MyInitializerEntryPoint {
    fun myExample(): MyExample
}
