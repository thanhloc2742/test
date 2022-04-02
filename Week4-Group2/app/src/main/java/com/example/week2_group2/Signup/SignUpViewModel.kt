package com.example.week2_group2.Signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.week2_group2.Check

class SignUpViewModel: ViewModel() {

    private var _errorNotice : MutableLiveData<String> = MutableLiveData() // Có thể thay đổi, chỉ dùng cho class Sign Up
    val notice : LiveData<String> // Không thể thay đổi, dùng để cho các class khác truy cập vào
        get() = _errorNotice

    private var _successNotice : MutableLiveData<Boolean> = MutableLiveData()
    val successNotice : LiveData<Boolean>
    get() = _successNotice


    fun CheckEmailAndPassword(email: String,password: String){

        if (!Check.EmailValidCheck(email)) {
            _errorNotice.postValue("Email không hợp lệ")
            return
        }
        else if(!Check.PasswordValidCheck(password)){
            _errorNotice.postValue("Password không hợp lệ")
            return
        }
        else{
            return _successNotice.postValue(true)}

    }

    }
