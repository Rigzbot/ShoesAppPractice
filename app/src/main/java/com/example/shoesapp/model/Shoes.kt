package com.example.shoesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Shoes (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourcePriceId: Int) {
}