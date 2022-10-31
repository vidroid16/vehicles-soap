package com.example.vehicles.dtos;

import com.example.vehicles.models.Vehicle;
import lombok.Data;

import java.util.List;

@Data
public class TotalCountDto {
    List<VehicleDto> vehicles;
    long totalCount;
}
