package com.example.crmtwo.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Lead(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val leadId: Long = 0,
    val name: String,
    val email: String,
    val status: String = "active", // Campo agregado
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    val customer: Customer? = null // Relación con Customer
)
