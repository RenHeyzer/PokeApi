package com.renheyzer.domain.usecases

import com.renheyzer.domain.repositories.PokemonRepository
import javax.inject.Inject

class GetPokemonUseCase @Inject constructor(
    private val repository: PokemonRepository,
) {

    operator fun invoke() =
        repository.getPokemon()
}