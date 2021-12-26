package me.orbitalno11.pokedex.domain.pokemon

import me.orbitalno11.pokedex.domain.model.pokemon.PokemonItem

interface PokemonRepository {
    suspend fun fetchPokemon(): List<PokemonItem>
}