package com.example.retrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.example.retrofit.main.DisneyViewModel
import com.example.retrofit.main.MainScreen
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    val viewModel by viewModels<DisneyViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(viewModel)
        }
    }
}