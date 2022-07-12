package com.renheyzer.data.network.dtos

import com.google.gson.annotations.SerializedName

data class SpritesDto(
    @SerializedName("front_shiny_female")
    val frontShinyFemale: String?,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: String?,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("other")
    val other: OtherDto
)