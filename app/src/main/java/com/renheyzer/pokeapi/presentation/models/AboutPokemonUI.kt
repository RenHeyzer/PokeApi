package com.renheyzer.pokeapi.presentation.models

import com.renheyzer.core.base.IBaseDiffModel

data class AboutPokemonUI(
    val abilities: List<AbilitiesUI>,
    val baseExperience: Int,
    val forms: List<FormsUI>,
    val height: Int,
    val id: Int,
    val isDefault: Boolean,
    val locationAreaEncounters: String?,
    override val name: String,
    val order: Int,
    val species: SpeciesUI,
    val sprites: SpritesUI,
    val attackBaseStat: Int,
    val defenseBaseStat: Int,
    val hpBaseStat: Int,
    val types: List<TypesUI>,
    val weight: Int,
    val color: String
) : IBaseDiffModel