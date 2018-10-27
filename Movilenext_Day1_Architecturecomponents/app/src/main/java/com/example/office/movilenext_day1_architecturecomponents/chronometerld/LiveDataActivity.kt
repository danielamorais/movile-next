package com.example.office.movilenext_day1_architecturecomponents.chronometerld

import android.annotation.SuppressLint
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.office.movilenext_day1_architecturecomponents.R
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    private val liveDateTimerViewModel by lazy {
        ViewModelProviders
            .of(this)
            .get<LiveDataTimerViewModel>(LiveDataTimerViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        subscribe()
    }

    @SuppressLint("SetTextI18n")
    private fun subscribe() {
        val elapsedTimeObserver = Observer<Long> {
            tvTimer.text = "$it segundos se passaram."
        }

        liveDateTimerViewModel.elapsedTime.observe(this, elapsedTimeObserver)
    }
}
