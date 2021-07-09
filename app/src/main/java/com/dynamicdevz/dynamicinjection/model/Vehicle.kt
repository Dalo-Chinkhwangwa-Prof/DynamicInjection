package com.dynamicdevz.dynamicinjection.model

import android.util.Log
import com.dynamicdevz.dynamicinjection.di.component.AppComponent
import com.dynamicdevz.dynamicinjection.di.component.DaggerAppComponent
import javax.inject.Inject

class Vehicle(private val name: String) {

    @Inject
    lateinit var engine: Engine

    @Inject
    lateinit var radio: Radio

    private var appComponent: AppComponent

    init {
        appComponent = DaggerAppComponent.create()
        appComponent.inject(this)
    }

    fun driveCar(){
        Log.d("TAG_X", "$name is now driving")
    }

    fun playSong(song: String){
        Log.d("TAG_X", "$name is now playing $song")
    }


}




