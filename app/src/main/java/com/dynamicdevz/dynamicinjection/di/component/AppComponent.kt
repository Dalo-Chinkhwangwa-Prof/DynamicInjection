package com.dynamicdevz.dynamicinjection.di.component

import com.dynamicdevz.dynamicinjection.di.module.CarModule
import com.dynamicdevz.dynamicinjection.model.Car
import com.dynamicdevz.dynamicinjection.model.Vehicle
import dagger.Component

@Component(modules = [CarModule::class])
interface AppComponent {
//    fun getCar(): Car
    fun inject(vehicle: Vehicle)
}