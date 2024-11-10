package com.gonzaloracerogalan.cursokmparis

import androidx.compose.ui.window.ComposeUIViewController
import com.gonzaloracerogalan.cursokmparis.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initKoin() }
) { App() }