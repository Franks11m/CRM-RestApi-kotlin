package com.example.crmtwo.repository

import com.example.crmtwo.dto.LeadActivityViewDto
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LeadActivityViewRepository : CrudRepository<LeadActivityViewDto, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM lead_activity_view")
    fun findAllLeadActivities(): List<LeadActivityViewDto>
}
