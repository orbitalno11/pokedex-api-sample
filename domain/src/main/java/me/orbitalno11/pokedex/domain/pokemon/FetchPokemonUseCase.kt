package me.orbitalno11.pokedex.domain.pokemon

import me.orbitalno11.pokedex.domain.model.pokemon.PokemonItem

class FetchPokemonUseCase(
    private val pokemonRepository: PokemonRepository
) {
    suspend fun invoke(): List<PokemonItem> {
        return pokemonRepository.fetchPokemon()
    }
}