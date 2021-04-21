package com.example.testkotlin2.parts

import com.example.testkotlin2.parts.Engine
import javax.inject.Inject

class DieselEngine @Inject constructor(val horsePower: Int): Engine {

    override fun getType(): String {
        return "Diesel (HP $horsePower)"
    }
}