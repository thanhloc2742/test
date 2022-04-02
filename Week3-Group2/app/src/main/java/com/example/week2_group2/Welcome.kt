package com.example.week2_group2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val imagefb = findViewById<ImageView>(R.id.imagefb)
        val imagegg = findViewById<ImageView>(R.id.imagegg)
        val imagehaveacc = findViewById<ImageView>(R.id.imagehaveacc)
        val imagephone = findViewById<ImageView>(R.id.imagephone)
        val imageskip1 = findViewById<ImageView>(R.id.imageskip1)
        imageskip1.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
        imagehaveacc.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}