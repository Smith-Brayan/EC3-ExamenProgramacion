package com.example.pe.evaluacioncontinua3.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pe.evaluacioncontinua3.R
import com.example.pe.evaluacioncontinua3.databinding.FoodItemBinding
import com.example.pe.evaluacioncontinua3.model.Food

class FoodAdapter(
    private val list: List<Food>,
    private val context: Context,
    private val onItemClick: (Food) -> Unit,
) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            FoodItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        list[position].let {
            holder.bindItems(it)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class ViewHolder(private val binding: FoodItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindItems(food: Food) {
            binding.tviName.text = food.name
            binding.tviDescription.text = food.detail

            Glide.with(context).load(food.image)
                .placeholder(R.drawable.baseline_food_bank_24).centerCrop().into(binding.iviLogo)

            binding.cviPlace.setOnClickListener {
                onItemClick(food)
            }

        }
    }


}