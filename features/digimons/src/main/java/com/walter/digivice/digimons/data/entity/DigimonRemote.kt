package com.walter.digivice.digimons.data.entity

import com.walter.digivice.digimons.domain.entity.Digimon
import kotlinx.serialization.Serializable

@Serializable
data class DigimonRemote(
    val name: String,
    val img : String
){
    fun transform() = Digimon(
        name = name,
        img = img
    )
}
