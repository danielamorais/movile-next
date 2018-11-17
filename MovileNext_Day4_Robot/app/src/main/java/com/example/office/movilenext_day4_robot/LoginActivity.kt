package com.example.office.movilenext_day4_robot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.longToast
import org.jetbrains.anko.yesButton

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            when {
                emailIsValid(email, password) -> {
                    tvNameSurname.text = getString(R.string.name_surname)
                    longToast("Yay!!")
                }
                emailIsEmpty(email, password) -> alert(R.string.missing_fields) {
                    yesButton { }
                }.show()
                else -> alert(R.string.login_fail) {
                    yesButton { }
                }.show()
            }

        }
    }

    private fun emailIsEmpty(email: String, password: String) = email.isEmpty() || password.isEmpty()

    private fun emailIsValid(email: String, password: String) =
        email == "admin@admin.com" && password == "admin"
}
