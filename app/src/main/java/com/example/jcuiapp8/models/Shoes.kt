package com.example.jcuiapp8.models

import androidx.annotation.DrawableRes

data class Shoes(
    var name: String,
    var price: Int,
    @DrawableRes var image: Int,
    var rate: Float,
    var liked: Boolean
)
