package me.orbitalno11.pokedex.core.model.pokemon

import com.google.gson.annotations.SerializedName

data class NetworkPokemonItemResponse(
    @SerializedName("count")
    var count: Int? = null,
    @SerializedName("next")
    var nextPage: String? = null,
    @SerializedName("previous")
    var previousPage: String? = null,
    @SerializedName("results")
    var results: List<NetworkPokemonItem>? = null
)
