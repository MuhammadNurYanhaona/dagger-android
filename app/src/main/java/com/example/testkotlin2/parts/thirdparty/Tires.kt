package com.example.testkotlin2.parts.thirdparty

import android.util.Log

private const val TAG = "Tire"

// Simulated third-party class we do not have control in
class Tires {

    public fun inflate() {
        Log.d(TAG, "inflate: ")
    }
}