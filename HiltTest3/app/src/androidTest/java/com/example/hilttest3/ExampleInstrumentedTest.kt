package com.example.hilttest3

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.hilttest3.injected.MyExample
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Before
import org.junit.Rule
import javax.inject.Inject

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
class ExampleInstrumentedTest {

    @Inject
    lateinit var myExample: MyExample

    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun useAppContext() {
        println("LUKE: TEST HASHCODE: ${myExample.hashCode()}")
        myExample.test("TestCase")
    }
}