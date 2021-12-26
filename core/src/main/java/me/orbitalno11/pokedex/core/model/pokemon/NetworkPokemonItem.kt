package me.orbitalno11.pokedex.core.model.pokemon

import com.google.gson.annotations.SerializedName

data class NetworkPokemonItem(
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("url")
    var detailUrl: String? = null
)