package com.example.shoesapp.data

import com.example.shoesapp.R
import com.example.shoesapp.model.Shoes

class DataSource {
    fun loadMenShoes(): List<Shoes>{
        return listOf<Shoes>(
            Shoes(R.string.mens_shoes1,R.drawable.shoes1,R.string.mens_shoes_price1),
            Shoes(R.string.mens_shoes2,R.drawable.shoes2,R.string.mens_shoes_price2),
            Shoes(R.string.mens_shoes3,R.drawable.shoes3,R.string.mens_shoes_price3),
            Shoes(R.string.mens_shoes4,R.drawable.shoes4,R.string.mens_shoes_price4),
            Shoes(R.string.mens_shoes5,R.drawable.shoes5,R.string.mens_shoes_price5)
        )
    }
    fun loadWomenShoes(): List<Shoes>{
        return listOf<Shoes>(
            Shoes(R.string.women_shoes1,R.drawable.womenshoes1,R.string.women_shoes_price1),
            Shoes(R.string.women_shoes2,R.drawable.womenshoes2,R.string.women_shoes_price2),
            Shoes(R.string.women_shoes3,R.drawable.womenshoes3,R.string.women_shoes_price3),
            Shoes(R.string.women_shoes4,R.drawable.womenshoes4,R.string.women_shoes_price4),
            Shoes(R.string.women_shoes5,R.drawable.womenshoes5,R.string.women_shoes_price5)
        )
    }
    fun loadKidsShoes(): List<Shoes>{
        return listOf<Shoes>(
            Shoes(R.string.kids_shoes1,R.drawable.kidsshoes1,R.string.kids_shoes_price1),
            Shoes(R.string.kids_shoes2,R.drawable.kidsshoes2,R.string.kids_shoes_price2),
            Shoes(R.string.kids_shoes3,R.drawable.kidsshoes3,R.string.kids_shoes_price3),
            Shoes(R.string.kids_shoes4,R.drawable.kidsshoes4,R.string.kids_shoes_price4),
            Shoes(R.string.kids_shoes5,R.drawable.kidsshoes5,R.string.kids_shoes_price5)
        )
    }
}