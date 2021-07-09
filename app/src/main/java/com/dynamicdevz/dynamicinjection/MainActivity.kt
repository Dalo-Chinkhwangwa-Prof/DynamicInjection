package com.dynamicdevz.dynamicinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dynamicdevz.dynamicinjection.di.component.AppComponent
import com.dynamicdevz.dynamicinjection.model.Vehicle

class MainActivity : AppCompatActivity() {

    private lateinit var appComponent: AppComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        appComponent = DaggerAppComponent.create()
//
//        val car = appComponent.getCar()
//        car.drive("BMW")
//        car.playSong("2Pac California")

        val vehicle = Vehicle("Bat Mobile")
        vehicle.driveCar()
        vehicle.playSong("Batman theme song")

    }

}