package com.example.week2_group2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.week2_group2.databinding.ActivitySignupBinding

class Signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    lateinit var signViewModel: SignUpViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_signup)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)
        signViewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)
        val name1 = binding.name1
        val email1 = binding.email1
        val pass1 = binding.pass1
        val buttonloginagain = binding.imageView59
        val buttonsignup = binding.imageView60

        buttonsignup.setOnClickListener() {
            var email = email1.text.toString().trim() // Email dang txt
            var pass = pass1.text.toString().trim()  // Password dang txt


            signViewModel.CheckEmailAndPassword(email, pass)
        }
        listenerSucessEvent()
        listenerErrorEvent()


    }

          private fun listenerSucessEvent(){
        signViewModel.successNotice.observe(this){signUpSuccess->
            if(signUpSuccess){
                val email1 = binding.email1
                val pass1 = binding.pass1

                //Code here to get the value type string from edit text

                var email = email1.text.toString().trim() // Email dang txt
                var pass = pass1.text.toString().trim()  // Password dang txt

                UserInfo.emailInfo = email
                UserInfo.passInfo = pass

                //Code here to Start the new activity
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            }
        }
    }

    private fun listenerErrorEvent(){
        signViewModel.notice.observe(this){signUpFailed->
            Toast.makeText(this,signUpFailed,Toast.LENGTH_SHORT).show()

            }
        }

    }


