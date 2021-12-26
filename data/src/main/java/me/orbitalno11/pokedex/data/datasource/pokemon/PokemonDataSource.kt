package me.orbitalno11.pokedex.data.datasource.pokemon

import me.orbitalno11.pokedex.core.model.pokemon.NetworkPokemonItem

interface PokemonDataSource {
    suspend fun fetchPokemon(): List<NetworkPokemonItem>
}