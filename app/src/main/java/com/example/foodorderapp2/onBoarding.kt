package com.example.foodorderapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onBoarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        val getStartButton = findViewById<Button>(R.id.button2)

        getStartButton.setOnClickListener {
            val intent = Intent(this@onBoarding, loginP::class.java)
            startActivity(intent)
        }
    }
}