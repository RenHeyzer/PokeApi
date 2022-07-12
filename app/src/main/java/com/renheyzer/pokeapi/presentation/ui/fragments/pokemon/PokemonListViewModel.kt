package com.renheyzer.pokeapi.presentation.ui.fragments.pokemon

import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.renheyzer.core.base.BaseViewModel
import com.renheyzer.domain.usecases.GetPokemonUseCase
import com.renheyzer.pokeapi.presentation.models.PokemonUI
import com.renheyzer.pokeapi.presentation.models.mapper.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(
    private val getPokemonUseCase: GetPokemonUseCase,
) : BaseViewModel() {

    private val _pokemonState = MutableStateFlow<PagingData<PokemonUI>>(PagingData.empty())
    val pokemonState = _pokemonState.asStateFlow()

    /**
     * Start request on init ViewModel
     */
    init {
        getPokemon()
    }

    /**
     * Collecting data from a flow and setting it to StateFlow
     * */
    fun getPokemon() = collectIdle(_pokemonState,
        getPokemonUseCase().cachedIn(viewModelScope)) { pagingData ->
        pagingData.map {
            it.toUI()
        }
    }
}