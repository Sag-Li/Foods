package com.sagli.foods.core.model

data class Merchandise(

    val id: String,

    val name: String,

    val category: MerchandiseCategory,

    val description: String,

    val quantityKg: Double,

    val pricePerKg: Double,

    val producerId: String,

    val producerName: String,

    val isProducerPremium: Boolean,

    val city: String,

    val state: String,

    val distanceKm: Double,

    val imageUrl: String? = null,

    val available: Boolean = true

)