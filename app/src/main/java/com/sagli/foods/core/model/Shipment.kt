package com.sagli.foods.core.model

data class Shipment(

    val id: String,

    val merchandiseId: String,

    val merchandiseName: String,

    val quantityKg: Double,

    val originCity: String,

    val destinationCity: String,

    val distanceKm: Double,

    val driverId: String?,

    val driverName: String?,

    val fuelVoucher: Double,

    val driverPayment: Double,

    val completed: Boolean

)