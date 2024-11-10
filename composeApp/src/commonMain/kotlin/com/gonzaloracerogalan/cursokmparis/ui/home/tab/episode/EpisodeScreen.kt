package com.gonzaloracerogalan.cursokmparis.ui.home.tab.episode

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun EpisodeScreen() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Llamada a funcion Exclusiva en funcion del dispositivo -> ${ejemploFuncionExpectActual()}")
        Box(modifier = Modifier.fillMaxSize().background(Color.Blue))
    }
}

expect fun ejemploFuncionExpectActual(): String