package com.example.testkotlin2.module

import com.example.testkotlin2.parts.thirdparty.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(private val driverName: String) {

        @Provides
        @Singleton
        public fun provideDriver(): Driver {
            return Driver(driverName)
        }
}