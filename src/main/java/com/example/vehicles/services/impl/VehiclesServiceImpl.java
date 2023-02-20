package com.example.vehicles.services.impl;

import com.example.vehicles.dtos.TotalCountDto;
import com.example.vehicles.dtos.VehicleDto;
import com.example.vehicles.dtos.VehicleToModifyDto;
import com.example.vehicles.mappers.VehicleMapper;
import com.example.vehicles.models.Coordinates;
import com.example.vehicles.models.Enums.FuelType;
import com.example.vehicles.models.Enums.VehicleType;
import com.example.vehicles.models.Vehicle;
import com.example.vehicles.repositories.VehicleRepository;
import com.example.vehicles.services.VehiclesService;
import com.example.vehicles.utils.Sortfields;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import jakarta.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class VehiclesServiceImpl implements VehiclesService {
    @Inject
    VehicleRepository vehicleRepository;

    @Override
    public void addVehicle(VehicleToModifyDto dto) throws ValidationException {
        Vehicle vehicle = VehicleMapper.modifiedDtoToVehicle(dto);
        vehicleRepository.addVehicle(vehicle);
    }

    @Override
    public void updateVehicle(VehicleToModifyDto dto, Long id) {
        Vehicle vehicle = VehicleMapper.modifiedDtoToVehicle(dto);
        vehicleRepository.updateVehicle(vehicle,id);
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteVehicle(id);
    }

    @Override
    public VehicleDto getVehicleById(Long id) {
        Vehicle vehicle = vehicleRepository.getById(id);
        return VehicleMapper.vehicleToDto(vehicle);
    }

    @Override
    public TotalCountDto getAllVehicles() {
        List<Vehicle> vehicleList = vehicleRepository.getAll();
        List<VehicleDto> vehicleDtoList = new ArrayList<>();

        vehicleList.forEach(v -> vehicleDtoList.add(VehicleMapper.vehicleToDto(v)));

        TotalCountDto res = new TotalCountDto();
        res.setVehicles(vehicleDtoList);
        res.setTotalCount(vehicleRepository.getTotalCount());
        return res;
    }

    @Override
    public TotalCountDto getVehicles(String sort, String sortType, int page, int pageSize,
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
                                        List<String> filterFuelType) {
        String sortfield = Sortfields.ID.fieldname;
        try {
            if(sort.equals("coordinates")){
                sortfield = "coordinates";
            }else {
                sortfield = Sortfields.ID.getByFieldname(sort).fieldname;
            }
        }catch (Exception e){
            sortfield = Sortfields.ID.fieldname;
        }

        if(sortType==null){
            sortType = "asc";
        }else {
            if(!sortType.equals("asc") && !sortType.equals("desc")){
                sortType = "asc";
            }
        }

        List<Vehicle> vehicleList = vehicleRepository.getPage(sortfield,sortType,page,pageSize,filterId,filterName,
                filterDate,filterWheels,filterMileage,filterEngine,filterFuelCons,filterX,filterY,filterVehicleType,
                filterFuelType);
        List<VehicleDto> vehicleDtoList = new ArrayList<>();

        vehicleList.forEach(v -> vehicleDtoList.add(VehicleMapper.vehicleToDto(v)));

        TotalCountDto res = new TotalCountDto();
        res.setVehicles(vehicleDtoList);
        res.setTotalCount(vehicleRepository.getTotalCount());
        return res;
    }

    @Override
    public Long getEnginePowerSum() {
        return vehicleRepository.getEnginePowerSum();
    }

    @Override
    public Long getEnginePowerMoreThan(int p) {
        return vehicleRepository.getEnginePowerMoreThan(p);
    }

    @Override
    public TotalCountDto getAllWithNameLike(String substring) {
        List<Vehicle> vehicleList = vehicleRepository.getAllWithNameLike(substring);
        ArrayList<VehicleDto> vehicleDtos = new ArrayList<>();

        vehicleList.forEach(v->vehicleDtos.add(VehicleMapper.vehicleToDto(v)));

        TotalCountDto res = new TotalCountDto();
        res.setVehicles(vehicleDtos);
        res.setTotalCount(vehicleRepository.getTotalCount());

        return res;
    }
}
