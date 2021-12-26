package me.orbitalno11.pokedex.data

import me.orbitalno11.pokedex.data.datasource.pokemon.PokemonDataSource
import me.orbitalno11.pokedex.data.datasource.pokemon.PokemonDataSourceImpl
import me.orbitalno11.pokedex.data.datasource.pokemon.PokemonRepositoryImpl
import me.orbitalno11.pokedex.domain.pokemon.PokemonRepository
import org.koin.dsl.module

val dataModule = module {
    factory<PokemonRepository> { PokemonRepositoryImpl(get()) }
    factory <PokemonDataSource> { PokemonDataSourceImpl(get()) }

}