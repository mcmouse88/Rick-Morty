package com.mcmouse88.rickandmortyagain.presentation.models

data class CharacterUiModel(
    val id: Int,
    val name: String,
    val species: String,
    val gender: String,
    val image: String,
    val location: LocationUiModel,
    val episode: List<String>,
)