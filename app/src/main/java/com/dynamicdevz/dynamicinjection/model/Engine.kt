package com.dynamicdevz.dynamicinjection.model

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(){
    fun driveCar(){
        Log.d("TAG_X", "Vrrroooooom")
    }
}