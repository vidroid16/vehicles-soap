package com.example.vehicles.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TotalCountDtoResponse {
    int status;
    TotalCountDto dto;
}
