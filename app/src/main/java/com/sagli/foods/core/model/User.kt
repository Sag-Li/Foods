package com.sagli.foods.core.model

data class User(

    val id: String,

    val name: String,

    val email: String,

    val phone: String,

    val password: String,

    val city: String,

    val state: String,

    val userType: UserType,

    val partnerCategory: PartnerCategory? = null,

    val driverStatus: DriverStatus? = null,

    val isPremium: Boolean = false,

    val foodsSealActive: Boolean = false,

    val saldoVendaGlobalKg: Double = 0.0,

    val totalDonatedKg: Double = 0.0,

    val rankingPosition: Int = 0,

    val latitude: Double = 0.0,

    val longitude: Double = 0.0

)