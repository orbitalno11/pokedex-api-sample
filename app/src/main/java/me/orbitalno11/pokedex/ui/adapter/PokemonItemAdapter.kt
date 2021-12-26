package me.orbitalno11.pokedex.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import me.orbitalno11.pokedex.databinding.ViewPokemonItemBinding
import me.orbitalno11.pokedex.domain.model.pokemon.PokemonItem

class PokemonItemAdapter(private val list: List<PokemonItem>) :
    RecyclerView.Adapter<PokemonItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ViewPokemonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                viewItem.pokemonNameTextView.text = name
                viewItem.root.setOnClickListener {
                    Toast.makeText(it.context, name, Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(val viewItem: ViewPokemonItemBinding) :
        RecyclerView.ViewHolder(viewItem.root)
}