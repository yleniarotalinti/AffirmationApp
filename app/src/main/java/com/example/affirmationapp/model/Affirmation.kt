package com.example.affirmationapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//adding annotation helps Kotlin to distringuish between two Integer IDs
data class Affirmation (
        @StringRes val stringResourceId:Int,
        @DrawableRes val imageResourceId:Int) {
}