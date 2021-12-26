package me.orbitalno11.pokedex.data.datasource.pokemon

import android.util.Log
import me.orbitalno11.pokedex.core.connection.PokemonApi
import me.orbitalno11.pokedex.core.model.pokemon.NetworkPokemonItem
import java.lang.Exception

class PokemonDataSourceImpl(
    private val pokemonApi: PokemonApi
) : PokemonDataSource {
    override suspend fun fetchPokemon(): List<NetworkPokemonItem> {
        return try {
            val result = pokemonApi.fetchPokemon()
            result.results ?: listOf()
        } catch (e: Exception) {
            Log.e("ERROR", e.message.toString())
            listOf()
        }
    }
}