package com.example.week2_group2.Menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.week2_group2.Data.Info
import com.example.week2_group2.Data.ResInfo

class MenuViewModel: ViewModel() {

    var _listOfRestaurant: MutableLiveData<List<Info>> = MutableLiveData()
    val listOfRestaurant: LiveData<List<Info>>
    get() = _listOfRestaurant

    fun getDatafrom(){
        val dataStore = ResInfo.getData()
        _listOfRestaurant.postValue(dataStore)
    }
}