package com.example.pe.evaluacioncontinua3.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.pe.evaluacioncontinua3.R
import com.example.pe.evaluacioncontinua3.databinding.ActivityDetailBinding
import com.example.pe.evaluacioncontinua3.model.Food
import com.example.pe.evaluacioncontinua3.util.AppUtil

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
    }

    private fun setupView() {
        val food = intent.getSerializableExtra(AppUtil.KEY_FOOD) as? Food
        food?.let {
            binding.tviName.text = it.name
            binding.tviDescription.text = it.detail
            binding.tviPrice.text = "S/ ${String.format("%.2f", it.price)}"
            binding.tviIngDetail.text = it.ingredient
            Glide.with(this).load(it.image)
                .placeholder(R.drawable.baseline_food_bank_24).centerCrop().into(binding.iviImage)
        }
    }
}