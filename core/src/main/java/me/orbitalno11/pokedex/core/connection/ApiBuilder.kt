package me.orbitalno11.pokedex.core.connection

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiBuilder {

    companion object {
        const val BASE_URL = "https://pokeapi.co/api/v2/"
    }

    private fun createRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun pokemonApi(): PokemonApi {
        return createRetrofit().create(PokemonApi::class.java)
    }
}