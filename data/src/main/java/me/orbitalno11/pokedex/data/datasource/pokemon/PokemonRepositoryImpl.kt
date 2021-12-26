package me.orbitalno11.pokedex.data.datasource.pokemon

import me.orbitalno11.pokedex.data.model.pokemon.mapper.NetworkPokemonItemToPokemonItemMapper
import me.orbitalno11.pokedex.domain.model.pokemon.PokemonItem
import me.orbitalno11.pokedex.domain.pokemon.PokemonRepository

class PokemonRepositoryImpl(
    private val dataSource: PokemonDataSource
) : PokemonRepository {
    override suspend fun fetchPokemon(): List<PokemonItem> {
        return dataSource.fetchPokemon().map(NetworkPokemonItemToPokemonItemMapper::map)
    }
}