package com.example.week2_group2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)
        val btn1 = findViewById<Button>(R.id.button2)
        btn1.setOnClickListener {
            val intent = Intent(this, Onboarding2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("onboarding1", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onboarding1", "onResume")
    }

    override fun onPause() {
        super.onPause()
    }
}

