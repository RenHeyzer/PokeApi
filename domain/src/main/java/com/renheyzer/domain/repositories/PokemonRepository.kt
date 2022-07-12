package com.renheyzer.domain.repositories

import androidx.paging.PagingData
import com.renheyzer.common.either.Either
import com.renheyzer.domain.models.AboutPokemon
import com.renheyzer.domain.models.PokemonModel
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

    fun getPokemon(): Flow<PagingData<PokemonModel>>

    fun getPokemonByName(name: String): Flow<Either<String, AboutPokemon>>
}