package com.example.week2_group2.Login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.week2_group2.Check

class LoginViewModel: ViewModel() {

    private var _wrongNotice: MutableLiveData<String> = MutableLiveData()
    val wrong: LiveData<String>
        get() = _wrongNotice

    private var _rightNotice: MutableLiveData<Boolean> = MutableLiveData()
    val right: LiveData<Boolean>
        get() = _rightNotice




    fun CheckEmailAndPassword(email: String, password: String) {

        if (!Check.EmailValidCheck(email)) {
            _wrongNotice.postValue("Email không hợp lệ")
            return
        } else if (!Check.PasswordValidCheck(password)) {
            _wrongNotice.postValue("Password không hợp lệ")
            return
        } else if (!Check.CompareToValidMail(email)) {
            _wrongNotice.postValue("Email không tồn tại !")
            return
        } else if (!Check.CompareToValidPass(email,password)) {
            _wrongNotice.postValue("Sai mật khẩu")
            return
        } else {
            return _rightNotice.postValue(true)
        }

    }
}





