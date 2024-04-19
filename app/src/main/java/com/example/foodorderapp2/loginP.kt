package com.example.foodorderapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_p)

        val getStartButton = findViewById<Button>(R.id.loginButton)

        getStartButton.setOnClickListener {
            val intent = Intent(this@loginP, home_page::class.java)
            startActivity(intent)
        }
    }
}