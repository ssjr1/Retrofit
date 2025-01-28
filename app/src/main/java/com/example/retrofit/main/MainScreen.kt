package com.example.retrofit.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(viewModel: DisneyViewModel) {
    val state = viewModel.state

    if (state.isLoading) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }

    if (state.characters.isNotEmpty()) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(state.characters) {
                Text(text = it.name)
            }
        }
    }
}