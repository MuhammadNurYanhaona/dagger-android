package com.example.testkotlin2.parts

import javax.inject.Inject

class Chassis @Inject constructor() {

    private val color: String = "Red"

    fun getColor() : String {
        return color
    }
}