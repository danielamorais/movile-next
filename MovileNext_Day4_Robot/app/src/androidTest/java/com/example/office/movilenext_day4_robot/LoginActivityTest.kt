package com.example.office.movilenext_day4_robot

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.login.LoginRobot
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityTest {

    @get:Rule
    val rule = ActivityTestRule(LoginActivity::class.java)

    private lateinit var robot: LoginRobot

    @Before
    fun setUp() {
        robot = LoginRobot(rule.activity)
    }

    @Test
    fun loginSuccess() {
        robot.setEmail("admin@admin.com")
            .setPassword("admin")
            .clickLogin()
            .matchText(R.id.tvNameSurname, rule.activity.getString(R.string.name_surname))
    }

}