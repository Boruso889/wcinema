package com.example.worldcinemabeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)

        val RegPass: EditText = findViewById(R.id.RegPass)
        val RegMail: EditText = findViewById(R.id.RegMail)
        val RegFam: EditText = findViewById(R.id.RegFam)
        val RegName: EditText = findViewById(R.id.RegName)
        val RegCo: TextView = findViewById(R.id.RegCo)
        val RegBack: TextView = findViewById(R.id.RegBack)

        RegBack.setOnClickListener {
            val intent = Intent(this@SignUpScreen, SignInScreen::class.java)
            startActivity(intent)
            this@SignUpScreen.onPause()
        }


        RegCo.setOnClickListener {
            if (RegMail.text.isEmpty() || RegPass.text.isEmpty() || RegFam.text.isEmpty() || RegName.text.isEmpty()) {
                Toast.makeText(this@SignUpScreen, "Не все поля заполнены.", Toast.LENGTH_LONG)
                    .show()
            }
            if (!RegMail.text.contains("@")) {
                Toast.makeText(this@SignUpScreen, "Неправильно указана почта.", Toast.LENGTH_LONG)
                    .show()
            } else {
                val intent = Intent(this@SignUpScreen, MainActivity::class.java)
                startActivity(intent)
                this@SignUpScreen.finish()
            }
        }
    }
}