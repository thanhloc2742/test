package com.example.week2_group2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignUpViewModel: ViewModel() {

    private var _errorNotice : MutableLiveData<String> = MutableLiveData() // Có thể thay đổi, chỉ dùng cho class Sign Up
    val notice : LiveData<String> // Không thể thay đổi, dùng để cho các class khác truy cập vào
        get() = _errorNotice

    private var _successNotice : MutableLiveData<Boolean> = MutableLiveData()
    val successNotice : LiveData<Boolean>
    get() = _successNotice


    fun CheckEmailAndPassword(email: String,password: String){

        if (!Check.EmailValidCheck(email)) {
            _errorNotice.postValue("Email sai rồi bạn êi")
            return
        }
        else if(!Check.PasswordValidCheck(password)){
            _errorNotice.postValue("Password sai rồi bạn êi")
            return
        }
        else{
            return _successNotice.postValue(true)}

    }

    }
