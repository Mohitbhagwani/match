package com.sports.sportsmatch.model.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMatchRequestDTO {
    private String venue;
    private String matchDate;
    private UUID playerId;
}
