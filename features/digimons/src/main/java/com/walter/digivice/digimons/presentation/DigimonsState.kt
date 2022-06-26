package com.walter.digivice.digimons.presentation

import com.walter.digivice.digimons.domain.entity.Digimon

data class DigimonsState(
    val data: List<Digimon> = listOf()
)
