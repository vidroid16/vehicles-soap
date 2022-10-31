package com.example.vehicles.services;

import com.example.vehicles.dtos.TotalCountDto;
import com.example.vehicles.dtos.VehicleDto;
import com.example.vehicles.dtos.VehicleToModifyDto;
import com.example.vehicles.models.Vehicle;
import com.example.vehicles.repositories.VehicleRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.QueryParam;

import java.util.List;

public interface VehiclesService {
    void addVehicle(VehicleToModifyDto dto);
    void updateVehicle(VehicleToModifyDto dto, Long id);
    TotalCountDto getAllVehicles();

    TotalCountDto getVehicles(String sort, String sortType, int page, int pageSize,
                              List<Long> filterId,
                              List<String> filterName,
                              List<String> filterDate,
                              List<Integer> filterWheels,
                              List<Integer> filterMileage,
                              List<Integer> filterEngine,
                              List<Double> filterFuelCons,
                              List<Double> filterX,
                              List<Long> filterY,
                              List<String> filterVehicleType,
                              List<String> filterFuelType);
    void deleteVehicle(Long id);
    VehicleDto getVehicleById(Long id);

    Long getEnginePowerSum();

    Long getEnginePowerMoreThan(int p);

    TotalCountDto getAllWithNameLike(String substring);
}
