package com.example.crmtwo.controller

import com.example.crmtwo.dto.LeadActivityViewDto
import com.example.crmtwo.service.LeadActivityViewService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lead-activities")
class LeadActivityViewController(private val leadActivityViewService: LeadActivityViewService) {

    @GetMapping
    fun getAllLeadActivities(): List<LeadActivityViewDto> {
        return leadActivityViewService.getAllLeadActivities()
    }
}
