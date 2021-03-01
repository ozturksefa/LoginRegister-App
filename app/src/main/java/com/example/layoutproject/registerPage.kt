package com.example.layoutproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registerPage : AppCompatActivity() {


    lateinit var buttonNew: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)


        buttonNew = findViewById(R.id.buttonNew)

        buttonNew.setOnClickListener{

            newUser()

        }


    }

    private fun newUser(){

        val intent = Intent(this, MainActivity::class.java)//iki değer alır: nereden gönderileceği, nereye gönderileceği
        startActivity(intent)
    }
}