package com.renheyzer.pokeapi.presentation.ui.fragments.pokemon.detail

import com.renheyzer.core.base.BaseViewModel
import com.renheyzer.domain.usecases.GetPokemonByNameUseCase
import com.renheyzer.pokeapi.presentation.models.AboutPokemonUI
import com.renheyzer.pokeapi.presentation.models.mapper.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val getPokemonByIdUseCase: GetPokemonByNameUseCase,
) : BaseViewModel() {

    private val _pokemonDetailState = mutableStateFlow<AboutPokemonUI>()
    val pokemonDetailState = _pokemonDetailState.asStateFlow()

    fun getPokemonByName(name: String) {
        collectState(_pokemonDetailState, getPokemonByIdUseCase(name)) {
            it.toUI()
        }
    }
}