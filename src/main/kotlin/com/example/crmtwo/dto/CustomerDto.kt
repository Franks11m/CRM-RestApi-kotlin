package com.example.crmtwo.dto

data class CustomerDto(
    val id: Long, // El id debe ser no-nullable
    val fullName: String, // No debe ser null
    val email: String, // No debe ser null
    val phone: String? = null, // Puede ser null
    val address: String? = null // Puede ser null
)
