package com.example.testkotlin2.module

import com.example.testkotlin2.parts.DieselEngine
import com.example.testkotlin2.parts.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(var horsePower: Int) {

    @Provides
    fun providesDieselEngine(): Engine {
        return DieselEngine(horsePower = horsePower)
    }
}