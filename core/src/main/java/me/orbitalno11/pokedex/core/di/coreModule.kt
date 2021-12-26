package me.orbitalno11.pokedex.core.di

import me.orbitalno11.pokedex.core.connection.ApiBuilder
import me.orbitalno11.pokedex.core.connection.PokemonApi
import org.koin.dsl.module

val coreModule = module {
    single<PokemonApi> { ApiBuilder().pokemonApi() }
}