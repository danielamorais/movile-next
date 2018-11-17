package com.example.office.movilenext_day4_proguard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    companion object {
        private const val NUM_1 = 1
        const val NUM_2 = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        somar1(1, 2)
        val somar2 = somar2(1, 2)
        println(somar2)
        val somar3 = somar3()
        println(somar3)
    }

    fun somar1(num1: Int, num2: Int) {
        println(num1 + num2)
    }

    fun somar2(num1: Int, num2: Int) = num1 + num2

    fun somar3() = NUM_1 + NUM_2


}
