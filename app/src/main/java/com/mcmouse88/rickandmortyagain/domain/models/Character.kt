package com.mcmouse88.rickandmortyagain.domain.models

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("species") val species: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("image") val image: String,
    @SerializedName("location") val location: Location,
    @SerializedName("episode") val episode: List<String>,
    @SerializedName("origin") val origin: Origin,
    @SerializedName("status") val status: String,
    @SerializedName("type") val type: String,
    @SerializedName("url") val url: String,
    @SerializedName("created") val created: String
)