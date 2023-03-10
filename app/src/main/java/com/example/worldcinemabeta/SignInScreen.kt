package com.example.worldcinemabeta

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignInScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)

     //   getWindow().setStatusBarColor(getResources().getColor(R.color.Purplee)

        val edSignEmail: EditText = findViewById(R.id.edSignEmail)
        val edSignPass: EditText = findViewById(R.id.edSignPass)
        val tvRegSi: TextView = findViewById(R.id.tvRegSi)
        val tvSign: TextView = findViewById(R.id.tvSign)

        tvRegSi.setOnClickListener {
            val intent = Intent(this@SignInScreen, SignUpScreen::class.java)
            startActivity(intent)
            this@SignInScreen.onResume()


        }
        tvSign.setOnClickListener {
                if(edSignEmail.text.isEmpty()||edSignPass.text.isEmpty()){
                    Toast.makeText(this@SignInScreen, "Не все поля заполнены." , Toast.LENGTH_LONG).show()

                }
                if(!edSignEmail.text.contains("@")){
                    Toast.makeText(this@SignInScreen, "Неправильно указана почта." , Toast.LENGTH_LONG).show()

                } else{
                    val intent = Intent(this@SignInScreen, MainActivity::class.java)
                    startActivity(intent)
                    this@SignInScreen.finish()
                }
            }
        }
    }
