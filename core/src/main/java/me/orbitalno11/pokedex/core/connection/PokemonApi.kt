package me.orbitalno11.pokedex.core.connection

import me.orbitalno11.pokedex.core.model.pokemon.NetworkPokemonItemResponse
import retrofit2.http.GET

interface PokemonApi {
    @GET("pokemon")
    suspend fun fetchPokemon(): NetworkPokemonItemResponse
}