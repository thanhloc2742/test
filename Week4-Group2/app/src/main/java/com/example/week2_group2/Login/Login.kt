package com.example.week2_group2.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.week2_group2.Menu.MenuActivity
import com.example.week2_group2.Profile
import com.example.week2_group2.R
import com.example.week2_group2.Signup.Signup
import com.example.week2_group2.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    lateinit var thatview: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        thatview = ViewModelProvider(this).get(LoginViewModel::class.java)


        val imageback = binding.imageback
        val email_login = binding.emailLogin
        val pass_login = binding.passLogin
        val imageLogin = binding.imageLogin


        imageLogin.setOnClickListener() {

                var email = email_login.text.toString().trim()
                var pass = pass_login.text.toString().trim()
               thatview.CheckEmailAndPassword(email, pass)
        }
        SucessEvent()
        ErrorEvent()

        imageback.setOnClickListener(){
            intent = Intent(this,Signup::class.java)
            startActivity(intent)
        }
    }

    private fun SucessEvent(){
        thatview.right.observe(this){logInSuccess->
            if(logInSuccess){

                val email1 = binding.emailLogin
                val pass1 = binding.passLogin

                var email = email1.text.toString().trim() // Email dang txt
                var pass = pass1.text.toString().trim()  // Password dang txt


                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun ErrorEvent(){
        thatview.wrong.observe(this){logInFailed->
            Toast.makeText(this,logInFailed,Toast.LENGTH_SHORT).show()

        }
    }

}

