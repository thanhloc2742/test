package com.example.week2_group2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val imageview2 = findViewById<ImageView>(R.id.imageView2)
        imageview2.setOnClickListener{
            val intent = Intent(this@Splash, Onboarding1::class.java)
            startActivity(intent)
        }
    }
}