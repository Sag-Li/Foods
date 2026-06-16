package com.sagli.foods.core.model

data class Donation(

    val id: String,

    val donorId: String,

    val donorName: String,

    val receiverId: String,

    val receiverName: String,

    val merchandiseId: String,

    val merchandiseName: String,

    val weightKg: Double,

    val donationDate: Long

)