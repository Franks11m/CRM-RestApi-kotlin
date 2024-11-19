package com.example.crmtwo.mapper

import com.example.crmtwo.dto.ActivityDto
import com.example.crmtwo.entity.Activity
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object ActivityMapper {

    private val formatter = DateTimeFormatter.ISO_DATE_TIME // Para convertir LocalDateTime a String

    fun toDto(activity: Activity): ActivityDto {
        return ActivityDto(
            activityId = activity.activityId,
            leadId = activity.leadId, // leadId es Long, no se necesita conversión
            description = activity.description,
            activityType = activity.activityType,
            activityDate = activity.activityDate.format(formatter) // Convertimos LocalDateTime a String
        )
    }

    fun toEntity(activityDto: ActivityDto): Activity {
        return Activity(
            activityId = activityDto.activityId, // Asumimos que activityId es no-nullable
            leadId = activityDto.leadId ?: 0L, // Si leadId es null, asignamos 0
            description = activityDto.description,
            activityType = activityDto.activityType,
            activityDate = activityDto.activityDate?.let { // Convertimos de String a LocalDateTime
                LocalDateTime.parse(it, formatter)
            } ?: LocalDateTime.now() // Si la fecha es null, asignamos la fecha actual
        )
    }
}
