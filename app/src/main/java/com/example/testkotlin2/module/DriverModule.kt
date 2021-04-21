package com.example.testkotlin2.module

import com.example.testkotlin2.parts.thirdparty.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        @Singleton
        public fun provideDriver(): Driver {
            return Driver("Trusted Driver")
        }
    }
}