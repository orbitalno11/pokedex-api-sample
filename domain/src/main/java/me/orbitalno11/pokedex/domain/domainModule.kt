package me.orbitalno11.pokedex.domain

import me.orbitalno11.pokedex.domain.pokemon.FetchPokemonUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { FetchPokemonUseCase(get()) }
}