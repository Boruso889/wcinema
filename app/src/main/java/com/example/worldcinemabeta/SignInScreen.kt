package com.example.worldcinemabeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.GetChars
import android.widget.EditText
import android.widget.TextView

class SignInScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)

     //   getWindow().setStatusBarColor(getResources().getColor(R.color.Purplee)

        val edSignEmail: EditText = findViewById(R.id.edSignEmail)
        val edSignPass: EditText = findViewById(R.id.edSignPass)
        val tvRegSi: TextView = findViewById(R.id.tvRegSi)
        val tvSignSi: TextView = findViewById(R.id.tvSignSi)

        tvRegSi.setOnClickListener {
            val intent = Intent(this@SignInScreen, SignUpScreen::class.java)
            startActivity(intent)
            this@SignInScreen.onResume()
        }
    }
}