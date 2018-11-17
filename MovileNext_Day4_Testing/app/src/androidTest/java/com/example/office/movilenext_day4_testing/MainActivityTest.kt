package com.example.office.movilenext_day4_testing

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.widget.TextView
import org.hamcrest.Matchers.notNullValue
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    lateinit var activity: MainActivity

    @Before
    fun setUp() {
        val activity = rule.activity
    }

    @Test
    fun loadActivity_shouldShowHelloWorld() {
        val viewById = activity.findViewById<TextView>(R.id.textView)
        assertThat<TextView>(viewById, notNullValue())
    }

    @Test
    fun sendButton_shouldWriteHelloName() {
        onView(withHint("Type your name")).perform(typeText("Daniela"))
        onView(withText("Send")).perform(click())
        onView(withText("Hello Daniela")).check(matches(isDisplayed()))
    }
}