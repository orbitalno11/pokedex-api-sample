package me.orbitalno11.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import me.orbitalno11.pokedex.databinding.ActivityMainBinding
import me.orbitalno11.pokedex.domain.model.pokemon.PokemonItem
import me.orbitalno11.pokedex.ui.adapter.PokemonItemAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.pokemonList.observe(this, {
            setupList(it)
        })
    }

    private fun setupList(list: List<PokemonItem>) {
        binding.recyclerListView.layoutManager = LinearLayoutManager(this)
        binding.recyclerListView.adapter = PokemonItemAdapter(list)
    }
}