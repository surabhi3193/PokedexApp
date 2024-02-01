package com.example.home.data.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.feature.R
import com.example.feature.databinding.RecylerLayoutBinding
import com.example.network.model.PokemonDto
import getProgressDrawable
import loadImage


@SuppressLint("NotifyDataSetChanged")
class DataAdapter(
    private var pokemon: ArrayList<PokemonDto>,
    private val onClickListener: OnClickListener,
) : RecyclerView.Adapter<DataAdapter.PokemonViewHolder>() {

    fun updatePokenList(data: ArrayList<PokemonDto>) {
        pokemon.clear()
        pokemon.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RecylerLayoutBinding.inflate(layoutInflater)
        return PokemonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(pokemon[position])
        holder.itemView.setOnClickListener { onClickListener.onClick(pokemon[position]) }
    }

    override fun getItemCount(): Int {
        return pokemon.size
    }


    fun filterList(filterList: ArrayList<PokemonDto>) {
        pokemon = filterList
        notifyDataSetChanged()
    }

    class PokemonViewHolder(val binding: RecylerLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val progressDrawable = getProgressDrawable(binding.root.context)

        fun bind(data: PokemonDto) {
            binding.item = data
            binding.imageView.loadImage(data.getId(), progressDrawable, R.mipmap.ic_launcher_round)
        }
    }

}


class OnClickListener(val clickListener: (pokemonDto: PokemonDto) -> Unit) {
    fun onClick(pokemonDto: PokemonDto) = clickListener(pokemonDto)
}

