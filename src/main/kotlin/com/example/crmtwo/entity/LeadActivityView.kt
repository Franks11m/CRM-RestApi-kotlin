package com.example.crmtwo.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "lead_activity_view")
data class LeadActivityView(
    @Id
    @Column(name = "activityid") // Coincide con el nombre real de la columna
    val activityId: Long,

    @Column(name = "leadid")
    val leadId: Long?,

    @Column(name = "leadname")
    val leadName: String?,

    @Column(name = "leademail")
    val leadEmail: String?,

    @Column(name = "activitydescription")
    val activityDescription: String?,

    @Column(name = "activitydate")
    val activityDate: LocalDateTime?,

    @Column(name = "customerid")
    val customerId: Long?,

    @Column(name = "customername")
    val customerName: String?,

    @Column(name = "customeremail")
    val customerEmail: String?
)
