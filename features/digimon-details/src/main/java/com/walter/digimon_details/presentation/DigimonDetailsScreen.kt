package com.walter.digimon_details.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DigimonDetailsScreen() {
    Surface {
        Column {
            Text("Teste teste teste teste")
        }
    }
}

@Preview
@Composable
fun PreviewDigimonDetailsScreen() {
    DigimonDetailsScreen()
}