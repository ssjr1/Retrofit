package com.example.retrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.retrofit.main.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}