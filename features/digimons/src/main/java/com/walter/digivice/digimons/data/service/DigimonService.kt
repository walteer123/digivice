package com.walter.digivice.digimons.data.service

import com.walter.digivice.digimons.data.entity.DigimonRemote
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject

class DigimonService @Inject constructor (private val client: HttpClient) {

    suspend fun getDigimons(): List<DigimonRemote> = client.get("/api/digimon").body()

}
