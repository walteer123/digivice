package com.walter.digivice.digimons.data.repository

import com.walter.digivice.digimons.data.service.DigimonService
import com.walter.digivice.digimons.domain.DigimonRepository
import com.walter.digivice.digimons.domain.entity.Digimon
import javax.inject.Inject

class DigimonRepositoryImpl @Inject constructor(private val digimonService: DigimonService) :
    DigimonRepository {

    override suspend fun getAllDigimons(): List<Digimon> {
        return digimonService.getDigimons().map { it.transform() }
    }

}
