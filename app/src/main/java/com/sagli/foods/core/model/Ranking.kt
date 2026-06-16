package com.sagli.foods.core.model

data class Ranking(

    val userId: String,

    val userName: String,

    val position: Int,

    val donatedKg: Double,

    val multiplier: Int

)