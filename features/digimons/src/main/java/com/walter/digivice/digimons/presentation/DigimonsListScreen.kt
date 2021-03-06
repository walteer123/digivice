package com.walter.digivice.digimons.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.walter.digivice.digimons.domain.entity.Digimon

@Composable
fun DigimonsListScreen(
    digimonViewModel: DigimonViewModel = viewModel()
) {
    val state = digimonViewModel.state.collectAsState().value

    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(state.data) { item ->
            DigimonRow(digimon = item)
        }
    }

}

@Composable
fun DigimonRow(digimon: Digimon) {
    Row() {
        AsyncImage(
            model = digimon.img, contentDescription = "Digimon Image",
            modifier = Modifier.clip(CircleShape)
        )
        Text(text = digimon.name)
    }

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
