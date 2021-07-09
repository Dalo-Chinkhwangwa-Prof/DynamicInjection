package com.dynamicdevz.dynamicinjection.model

import android.util.Log
import javax.inject.Inject

class Car  @Inject constructor(
    private val engine: Engine,
    private val radio: Radio
) {

    fun drive(carName: String){
        Log.d("TAG_X", carName)
        engine.driveCar()
    }

    fun playSong(song: String){
        Log.d("TAG_X", "Car now playing song")
        radio.playSong(song)
    }


}