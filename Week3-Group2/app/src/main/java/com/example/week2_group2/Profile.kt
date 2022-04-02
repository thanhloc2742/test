package com.example.week2_group2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.week2_group2.databinding.ActivityLoginBinding
import com.example.week2_group2.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_profile)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)

            val email = UserInfo.emailInfo
            val pass = UserInfo.passInfo

            val textview = binding.textView8
            textview.text = "$email -- $pass"

    }
}