package com.walter.digivice.digimons.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.walter.digivice.digimons.domain.entity.Digimon

@Composable
fun DigimonsListScreen(
    digimonViewModel: DigimonViewModel = viewModel()
) {
    val state = digimonViewModel.state.collectAsState().value

    LazyColumn {
        items(state.data){ item ->
            DigimonRow(digimon = item)
        }
    }

}

@Composable
fun DigimonRow(digimon: Digimon) {
    Text(text = digimon.name)
}


@Preview
@Composable
fun PreviewDigimonList() {
    val list = listOf(
        Digimon("agumon", "123123"),
        Digimon("wargreymon", "123123"),
        Digimon("patamon", "123123"),
    )

    LazyColumn {
        items(list) {
            DigimonRow(digimon = it)
        }
    }
}
