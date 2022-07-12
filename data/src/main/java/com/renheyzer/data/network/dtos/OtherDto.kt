package com.renheyzer.data.network.dtos

import com.google.gson.annotations.SerializedName

data class OtherDto(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorldDto,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtworkDto,
)