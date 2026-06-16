package com.sagli.foods.core.model

data class Transaction(

    val id: String,

    val merchandiseId: String,

    val merchandiseName: String,

    val buyerId: String,

    val buyerName: String,

    val sellerId: String,

    val sellerName: String,

    val totalValue: Double,

    val freightCost: Double,

    val netProfit: Double,

    val approved: Boolean

)