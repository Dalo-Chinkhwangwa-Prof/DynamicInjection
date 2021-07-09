package com.dynamicdevz.dynamicinjection.di.module

import com.dynamicdevz.dynamicinjection.model.Engine
import com.dynamicdevz.dynamicinjection.model.Radio
import dagger.Module
import dagger.Provides

@Module
class CarModule {

    @Provides
    fun getRadio() = Radio()

    @Provides
    fun getEngine() = Engine()

}