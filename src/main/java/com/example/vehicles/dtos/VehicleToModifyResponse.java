package com.example.vehicles.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VehicleToModifyResponse {
    int status;
    VehicleToModifyDto dto;
}