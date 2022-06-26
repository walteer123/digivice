package com.walter.digivice.digimons.domain

import com.walter.digivice.digimons.domain.entity.Digimon

interface DigimonRepository {
    suspend fun getAllDigimons(): List<Digimon>
}
