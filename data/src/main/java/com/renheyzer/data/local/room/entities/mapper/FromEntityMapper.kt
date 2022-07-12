package com.renheyzer.data.local.room.entities.mapper

import com.renheyzer.data.local.room.entities.PokemonEntity
import com.renheyzer.domain.models.PokemonModel

/**
 * Mapper file for map models from entity to domain
 */

fun PokemonEntity.toDomain() = PokemonModel(
    id, name, url, image, type, color, attackStat, defenseStat, hpStat
)