package com.example.birds.model

import androidx.annotation.DrawableRes

data class Bird(
    @DrawableRes val imageResourceId: Int,
    val name: String
)