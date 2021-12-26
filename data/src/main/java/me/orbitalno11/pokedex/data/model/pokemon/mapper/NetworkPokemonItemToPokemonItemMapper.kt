package me.orbitalno11.pokedex.data.model.pokemon.mapper

import me.orbitalno11.pokedex.core.model.pokemon.NetworkPokemonItem
import me.orbitalno11.pokedex.domain.model.pokemon.PokemonItem

object NetworkPokemonItemToPokemonItemMapper {
    fun map(from: NetworkPokemonItem): PokemonItem {
        return PokemonItem(from.name ?: "", from.detailUrl ?: "")
    }
}