package com.example.hilttest3.initializer

import android.content.Context
import androidx.startup.Initializer
import com.example.hilttest3.injected.MyExample
import dagger.hilt.android.EntryPointAccessors

class MyExampleInitializer : Initializer<MyExample> {
    override fun create(context: Context): MyExample {
        println("LUKE INITIALIZER BEGIN")
        context.applicationContext ?: throw IllegalStateException()
        println("LUKE HAS APP CONTEXT")
        val entryPoint = EntryPointAccessors.fromApplication(context.applicationContext, MyInitializerEntryPoint::class.java)
        println("LUKE HAS ENTRY POINT ${entryPoint.hashCode()}")
        val myExample = entryPoint.myExample()

        myExample.test("initializer")

        return myExample
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        // No dependencies on other libraries.
        return emptyList()
    }
}
