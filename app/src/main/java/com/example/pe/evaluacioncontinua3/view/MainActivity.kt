package com.example.pe.evaluacioncontinua3.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pe.evaluacioncontinua3.databinding.ActivityMainBinding
import com.example.pe.evaluacioncontinua3.model.Food
import com.example.pe.evaluacioncontinua3.util.AppUtil
import com.example.pe.evaluacioncontinua3.view.adapter.FoodAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: FoodAdapter
    private lateinit var food: Food
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        food = Food()

        setupAdapter()
    }

    private fun setupAdapter() {
        val linearLayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rviFoods.layoutManager = linearLayoutManager


        adapter = FoodAdapter(food.createListOfFoots(), this) { food ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(AppUtil.KEY_FOOD, food)
            startActivity(intent)
        }
        binding.rviFoods.adapter = adapter
    }


}