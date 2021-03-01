package com.example.layoutproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var buttonLogin: Button
    lateinit var buttonRegister: Button
    lateinit var textInputEditTextUsername: TextInputEditText
    lateinit var textInputEditTextPassword: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//layout oluşturuluyor

        textInputEditTextUsername =
            findViewById(R.id.textInputEditTextUsername)
        textInputEditTextPassword =
            findViewById(R.id.textInputEditTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)
        buttonRegister = findViewById(R.id.buttonRegister)
        //buttonLogin.text="ABC" //kodlama yaparak attribute ekleme

        buttonLogin.setOnClickListener {
            loginUser()
        }

        buttonRegister.setOnClickListener{
            registerUser()
        }

    }

    private fun loginUser(){

        val intent = Intent(this, loginPage::class.java)//iki değer alır: nereden gönderileceği, nereye gönderileceği
        startActivity(intent)
    }

    private fun registerUser(){
        val intent = Intent(this, registerPage::class.java)//iki değer alır: nereden gönderileceği, nereye gönderileceği
        startActivity(intent)
    }


}