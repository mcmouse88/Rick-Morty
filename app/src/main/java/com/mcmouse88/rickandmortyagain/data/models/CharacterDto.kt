package com.mcmouse88.rickandmortyagain.data.models

import com.mcmouse88.rickandmortyagain.domain.models.Location
import com.mcmouse88.rickandmortyagain.domain.models.Origin

data class CharacterDto(
    val id: Int,
    val name: String,
    val species: String,
    val gender: String,
    val image: String,
    val location: Location,
    val episode: List<String>,
    val origin: Origin,
    val status: String,
    val type: String,
    val url: String,
    val created: String
)