package com.example.testkotlin2

import android.util.Log
import com.example.testkotlin2.parts.Car
import javax.inject.Inject

private const val TAG = "Remote"

class Remote @Inject constructor() {

    public fun setListener(car: Car)  {
        Log.d(TAG, "Remote connected.")
    }
}