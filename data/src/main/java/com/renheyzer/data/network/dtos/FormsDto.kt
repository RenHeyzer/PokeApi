package com.renheyzer.data.network.dtos

import com.google.gson.annotations.SerializedName

data class FormsDto(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?,
)