package com.login

import android.content.Context
import android.support.test.espresso.ViewInteraction
import com.example.office.movilenext_day4_robot.R
import com.robot.BaseTestRobot

class LoginRobot(private val context: Context) : BaseTestRobot() {
    fun setEmail(email: String) = apply {
        fillEditText(R.id.etEmail, email)
    }

    fun setPassword(pass: String) = apply {
        fillEditText(R.id.etPassword, pass)
    }

    fun clickLogin() = apply {
        clickButton(R.id.btLogin)
    }

    fun matchErrorText(err: Int): ViewInteraction {
        return matchText(
            textView(android.R.id.message),
            context.getString(err)
        )
    }

}

