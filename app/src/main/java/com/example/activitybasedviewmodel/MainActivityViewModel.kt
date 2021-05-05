package com.example.activitybasedviewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var first_fragment : String
    var second_fragment : String
    var third_fragment : String

    init {
        first_fragment = ""
        second_fragment = ""
        third_fragment = ""
    }

    fun set_first_fragment_et(text : String){
        first_fragment = text
    }
    fun set_second_fragment_et(text : String){
        second_fragment = text
    }
    fun set_third_fragment_et(text : String){
        third_fragment = text
    }


}