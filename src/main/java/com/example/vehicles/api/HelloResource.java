package com.example.vehicles.api;

import com.example.vehicles.dtos.*;
import com.example.vehicles.models.Enums.VehicleType;
import com.example.vehicles.models.HelloEntity;
import com.example.vehicles.repositories.HelloRepository;
import com.example.vehicles.services.VehiclesService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import jakarta.inject.Inject;

import jakarta.validation.ValidationException;
import jakarta.ws.rs.*;
import java.util.List;


@WebService
@ApplicationScoped
public class HelloResource {
    @Inject
    private HelloRepository helloRepository;
    @Inject
    private VehiclesService vehiclesService;

    public String getHi(){
        return "What a stupid name - SOAP!";
    }

    @WebMethod
    public String hello() {
        HelloEntity helloEntity = new HelloEntity();
        //helloEntity.setName("Random"+(int)(Math.random()*100));
        helloEntity.setName("BarakObama");
        helloRepository.create(helloEntity);
        return VehicleType.valueOf("HELICOPTER").toString();
    }

    @WebMethod
    public DefaultResponse addVehicle(VehicleToModifyDto dto){
        try{
            vehiclesService.addVehicle(dto);
        }catch (ValidationException e){
            e.printStackTrace();
            //return new DefaultResponse(403,"Validation exeption");
            throw new BadRequestException("Неправильный Vehicle!");
        }
        catch (NullPointerException | IllegalArgumentException e ){
            throw new BadRequestException("Неправильный Vehicle!");
        }
        return new DefaultResponse(200,"OK");
    }
    @WebMethod
    public TotalCountDtoResponse getVehicles(@WebParam(name = "page") int page,
                                             @WebParam(name="page-size") int pageSize,
                                             @WebParam(name="sort") String sort,
                                             @WebParam(name="sort-type") String sortType,
                                             @WebParam(name="f-id") List<Long> filterId,
                                             @WebParam(name="f-name") List<String> filterName,
                                             @WebParam(name="f-date") List<String> filterDate,
                                             @WebParam(name="f-wheels-number") List<Integer> filterWheels,
                                             @WebParam(name="f-mileage") List<Integer> filterMileage,
                                             @WebParam(name="f-engine-power") List<Integer> filterEngine,
                                             @WebParam(name="f-fuel-consumption") List<Double> filterFuelCons,
                                             @WebParam(name="f-x") List<Double> filterX,
                                             @WebParam(name="f-y") List<Long> filterY,
                                             @WebParam(name="f-vehicle-type") List<String> filterVehicleType,
                                             @WebParam(name="f-fuel-type") List<String> filterFuelType
    ){
        try {
            TotalCountDto dtos = vehiclesService.getVehicles(sort,sortType,page,pageSize,filterId,filterName,
                    filterDate,filterWheels,filterMileage,filterEngine,filterFuelCons,filterX,filterY,filterVehicleType,
                    filterFuelType);
            return new TotalCountDtoResponse(200,dtos);
        }catch (Exception e){
            e.printStackTrace();
            throw new InternalServerErrorException("Что-то пошло не так");
        }
    }

    @WebMethod
    public VehicleDtoResponse getVehicleById(@WebParam(name = "vehicle-id") Long id){
        try {
            VehicleDto dto = vehiclesService.getVehicleById(id);
            return new VehicleDtoResponse(200, dto);
        }catch (NullPointerException e){
            e.printStackTrace();
            throw new NotFoundException("Нет такого Vehicle!");
        }
    }

    @WebMethod
    public VehicleToModifyResponse updateVehicle(@WebParam(name = "vehicle-id") Long id, VehicleToModifyDto dto){
        try {
            vehiclesService.updateVehicle(dto,id);
        }catch (ValidationException e){
            e.printStackTrace();
            throw new BadRequestException("Неправильный Vehicle!");
        }catch (NotFoundException e){
            throw new NotFoundException("Нет такого Vehicle!");
        }catch (NullPointerException | IllegalArgumentException e ){
            throw new BadRequestException("Неправильный Vehicle!");
        }
        return new VehicleToModifyResponse(200,null);
    }

    @WebMethod
    public DefaultResponse deleteVehicle(@WebParam(name = "vehicle-id") Long id){
        try {
            vehiclesService.deleteVehicle(id);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw new NotFoundException("Нет такого Vehicle!");
        }
        return new DefaultResponse(200,"OK");
    }

    @WebMethod
    public LongResponse getEnginePowerSum(){
        try {
            Long ans = vehiclesService.getEnginePowerSum();
            return new LongResponse(200,ans);
        }catch (ValidationException e){
            e.printStackTrace();
            return new LongResponse(403,null);
        }
    }

    @WebMethod
    public LongResponse getEnginePowerMoreThan(@WebParam(name = "engine-power") int enginePower){
        try {
            Long ans = vehiclesService.getEnginePowerMoreThan(enginePower);
            return new LongResponse(200, ans);
        }catch (ValidationException e){
            e.printStackTrace();
            return new LongResponse(403,null);
        }
    }

    @WebMethod
    public TotalCountDtoResponse getNameLike(@WebParam(name = "substring") String substr){
        try {
            TotalCountDto dtos = vehiclesService.getAllWithNameLike(substr);
            return new TotalCountDtoResponse(200, dtos);
        }catch (ValidationException e){
            e.printStackTrace();
            return new TotalCountDtoResponse(403, null);
        }
    }
}