package com.example.foodorderapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val getStartButton = findViewById<Button>(R.id.button4)

        getStartButton.setOnClickListener {
            val intent = Intent(this@home_page, viewPage::class.java)
            startActivity(intent)
        }
    }
}