package com.example.hilttest3

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import com.example.hilttest3.inheritance.HiltTestApp
import dagger.hilt.android.testing.HiltTestApplication

class MyTestRunner : AndroidJUnitRunner() {
    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?): Application {
        return super.newApplication(cl, "com.example.hilttest3.inheritance.HiltTestApp_Application", context)
    }
}
