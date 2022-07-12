package com.renheyzer.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.renheyzer.data.local.room.daos.PokemonListDao
import com.renheyzer.data.local.room.entities.PokemonEntity

@Database(entities = [PokemonEntity::class],
    version = 13,
    exportSchema = false)
abstract class PokeDatabase : RoomDatabase() {

    abstract fun pokemonListDao(): PokemonListDao
}