package me.orbitalno11.pokedex

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.orbitalno11.pokedex.domain.model.pokemon.PokemonItem
import me.orbitalno11.pokedex.domain.pokemon.FetchPokemonUseCase

class MainViewModel(
    private val fetchPokemonUseCase: FetchPokemonUseCase
) : ViewModel() {
    private val _pokemonList: MutableLiveData<List<PokemonItem>> = MutableLiveData()
    val pokemonList: LiveData<List<PokemonItem>>
        get() = _pokemonList

    init {
        fetchPokemon()
    }

    private fun fetchPokemon() {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                fetchPokemonUseCase.invoke()
            }
            _pokemonList.value = result
        }
    }
}