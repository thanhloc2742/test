package com.example.week2_group2

class Check {

    companion object{
        fun EmailValidCheck(MailCheck: String): Boolean {
            if(MailCheck.length>10){
                val MailCheck1 = MailCheck.substring(MailCheck.length-10,MailCheck.length)
                return MailCheck1 == "@gmail.com"
            }
            else return false
        }
        fun PasswordValidCheck(PassCheck: String): Boolean{
            return PassCheck.length in 6..12
        }

        fun CompareToValidMail(email: String,oldEmail : String): Boolean{

            return email == oldEmail
        }

        fun CompareToValidPass(password: String, oldPass: String): Boolean{
            return password == oldPass
        }
    }
}