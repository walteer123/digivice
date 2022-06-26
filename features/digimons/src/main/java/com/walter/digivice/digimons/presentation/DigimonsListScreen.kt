package com.walter.digivice.digimons.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun DigimonsListScreen(
    digimonViewModel: DigimonViewModel = viewModel()
) {
    digimonViewModel.getDigimons()
    Column {
        Text(text = "Teste!")
    }

}


