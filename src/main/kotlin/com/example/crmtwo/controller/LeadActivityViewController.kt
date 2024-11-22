package com.example.crmtwo.controller

import com.example.crmtwo.dto.LeadActivityViewDto
import com.example.crmtwo.service.LeadActivityViewService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/lead-activities")
class LeadActivityViewController(private val leadActivityViewService: LeadActivityViewService) {

    @GetMapping
    fun getAllLeadActivities(): List<LeadActivityViewDto> {
        return leadActivityViewService.getAllLeadActivities()
    }

    @GetMapping("/{id}")
    fun getLeadActivityById(@PathVariable id: Long): LeadActivityViewDto {
        return leadActivityViewService.getLeadActivityById(id)
    }
}
