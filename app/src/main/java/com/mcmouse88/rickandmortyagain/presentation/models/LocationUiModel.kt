package com.mcmouse88.rickandmortyagain.presentation.models

import com.google.gson.annotations.SerializedName

data class LocationUiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)