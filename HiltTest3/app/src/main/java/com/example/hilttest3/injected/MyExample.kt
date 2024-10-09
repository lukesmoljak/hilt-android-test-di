package com.example.hilttest3.injected

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyExample @Inject constructor() {

    init {
        println("LUKE: INIT HASHCODE ${this.hashCode()}")
    }

    fun test(from: String) {
        println("LUKE: EXECUTED! from $from")
    }
}