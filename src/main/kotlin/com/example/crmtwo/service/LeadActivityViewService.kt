package com.example.crmtwo.service

import com.example.crmtwo.dto.LeadActivityViewDto
import com.example.crmtwo.repository.LeadActivityViewRepository
import org.springframework.stereotype.Service

@Service
class LeadActivityViewService(private val leadActivityViewRepository: LeadActivityViewRepository) {

    fun getAllLeadActivities(): List<LeadActivityViewDto> {
        return leadActivityViewRepository.findAllLeadActivities()
    }
}
