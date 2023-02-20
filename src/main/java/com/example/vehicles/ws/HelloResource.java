
package com.example.vehicles.ws;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebService(name = "HelloResource", targetNamespace = "http://api.vehicles.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloResource {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHi", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetHi")
    @ResponseWrapper(localName = "getHiResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetHiResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/getHiRequest", output = "http://api.vehicles.example.com/HelloResource/getHiResponse")
    public String getHi();

    /**
     * 
     * @param enginePower
     * @return
     *     returns com.example.vehicles.ws.LongResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEnginePowerMoreThan", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetEnginePowerMoreThan")
    @ResponseWrapper(localName = "getEnginePowerMoreThanResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetEnginePowerMoreThanResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/getEnginePowerMoreThanRequest", output = "http://api.vehicles.example.com/HelloResource/getEnginePowerMoreThanResponse")
    public LongResponse getEnginePowerMoreThan(
        @WebParam(name = "engine-power", targetNamespace = "")
        int enginePower);

    /**
     * 
     * @param substring
     * @return
     *     returns com.example.vehicles.ws.TotalCountDtoResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNameLike", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetNameLike")
    @ResponseWrapper(localName = "getNameLikeResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetNameLikeResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/getNameLikeRequest", output = "http://api.vehicles.example.com/HelloResource/getNameLikeResponse")
    public TotalCountDtoResponse getNameLike(
        @WebParam(name = "substring", targetNamespace = "")
        String substring);

    /**
     * 
     * @param vehicleId
     * @return
     *     returns com.example.vehicles.ws.VehicleDtoResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVehicleById", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetVehicleById")
    @ResponseWrapper(localName = "getVehicleByIdResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetVehicleByIdResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/getVehicleByIdRequest", output = "http://api.vehicles.example.com/HelloResource/getVehicleByIdResponse")
    public VehicleDtoResponse getVehicleById(
        @WebParam(name = "vehicle-id", targetNamespace = "")
        Long vehicleId);

    /**
     * 
     * @return
     *     returns com.example.vehicles.ws.LongResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEnginePowerSum", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetEnginePowerSum")
    @ResponseWrapper(localName = "getEnginePowerSumResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetEnginePowerSumResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/getEnginePowerSumRequest", output = "http://api.vehicles.example.com/HelloResource/getEnginePowerSumResponse")
    public LongResponse getEnginePowerSum();

    /**
     * 
     * @param fId
     * @param fMileage
     * @param fFuelConsumption
     * @param pageSize
     * @param fDate
     * @param fVehicleType
     * @param sort
     * @param fX
     * @param fName
     * @param fY
     * @param fFuelType
     * @param sortType
     * @param fWheelsNumber
     * @param page
     * @param fEnginePower
     * @return
     *     returns com.example.vehicles.ws.TotalCountDtoResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVehicles", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetVehicles")
    @ResponseWrapper(localName = "getVehiclesResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.GetVehiclesResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/getVehiclesRequest", output = "http://api.vehicles.example.com/HelloResource/getVehiclesResponse")
    public TotalCountDtoResponse getVehicles(
        @WebParam(name = "page", targetNamespace = "")
        int page,
        @WebParam(name = "page-size", targetNamespace = "")
        int pageSize,
        @WebParam(name = "sort", targetNamespace = "")
        String sort,
        @WebParam(name = "sort-type", targetNamespace = "")
        String sortType,
        @WebParam(name = "f-id", targetNamespace = "")
        List<Long> fId,
        @WebParam(name = "f-name", targetNamespace = "")
        List<String> fName,
        @WebParam(name = "f-date", targetNamespace = "")
        List<String> fDate,
        @WebParam(name = "f-wheels-number", targetNamespace = "")
        List<Integer> fWheelsNumber,
        @WebParam(name = "f-mileage", targetNamespace = "")
        List<Integer> fMileage,
        @WebParam(name = "f-engine-power", targetNamespace = "")
        List<Integer> fEnginePower,
        @WebParam(name = "f-fuel-consumption", targetNamespace = "")
        List<Double> fFuelConsumption,
        @WebParam(name = "f-x", targetNamespace = "")
        List<Double> fX,
        @WebParam(name = "f-y", targetNamespace = "")
        List<Long> fY,
        @WebParam(name = "f-vehicle-type", targetNamespace = "")
        List<String> fVehicleType,
        @WebParam(name = "f-fuel-type", targetNamespace = "")
        List<String> fFuelType);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.vehicles.ws.DefaultResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addVehicle", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.AddVehicle")
    @ResponseWrapper(localName = "addVehicleResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.AddVehicleResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/addVehicleRequest", output = "http://api.vehicles.example.com/HelloResource/addVehicleResponse")
    public DefaultResponse addVehicle(
        @WebParam(name = "arg0", targetNamespace = "")
        VehicleToModifyDto arg0);

    /**
     * 
     * @param arg1
     * @param vehicleId
     * @return
     *     returns com.example.vehicles.ws.VehicleToModifyResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateVehicle", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.UpdateVehicle")
    @ResponseWrapper(localName = "updateVehicleResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.UpdateVehicleResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/updateVehicleRequest", output = "http://api.vehicles.example.com/HelloResource/updateVehicleResponse")
    public VehicleToModifyResponse updateVehicle(
        @WebParam(name = "vehicle-id", targetNamespace = "")
        Long vehicleId,
        @WebParam(name = "arg1", targetNamespace = "")
        VehicleToModifyDto arg1);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.HelloResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/helloRequest", output = "http://api.vehicles.example.com/HelloResource/helloResponse")
    public String hello();

    /**
     * 
     * @param vehicleId
     * @return
     *     returns com.example.vehicles.ws.DefaultResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteVehicle", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.DeleteVehicle")
    @ResponseWrapper(localName = "deleteVehicleResponse", targetNamespace = "http://api.vehicles.example.com/", className = "com.example.vehicles.ws.DeleteVehicleResponse")
    @Action(input = "http://api.vehicles.example.com/HelloResource/deleteVehicleRequest", output = "http://api.vehicles.example.com/HelloResource/deleteVehicleResponse")
    public DefaultResponse deleteVehicle(
        @WebParam(name = "vehicle-id", targetNamespace = "")
        Long vehicleId);

}
