package com.example.testkotlin2.module

import com.example.testkotlin2.parts.Engine
import com.example.testkotlin2.parts.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun providesEngine(engine: PetrolEngine) : Engine
}