
package com.example.vehicles.ws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.vehicles.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddVehicle_QNAME = new QName("http://api.vehicles.example.com/", "addVehicle");
    private final static QName _AddVehicleResponse_QNAME = new QName("http://api.vehicles.example.com/", "addVehicleResponse");
    private final static QName _DeleteVehicle_QNAME = new QName("http://api.vehicles.example.com/", "deleteVehicle");
    private final static QName _DeleteVehicleResponse_QNAME = new QName("http://api.vehicles.example.com/", "deleteVehicleResponse");
    private final static QName _GetEnginePowerMoreThan_QNAME = new QName("http://api.vehicles.example.com/", "getEnginePowerMoreThan");
    private final static QName _GetEnginePowerMoreThanResponse_QNAME = new QName("http://api.vehicles.example.com/", "getEnginePowerMoreThanResponse");
    private final static QName _GetEnginePowerSum_QNAME = new QName("http://api.vehicles.example.com/", "getEnginePowerSum");
    private final static QName _GetEnginePowerSumResponse_QNAME = new QName("http://api.vehicles.example.com/", "getEnginePowerSumResponse");
    private final static QName _GetHi_QNAME = new QName("http://api.vehicles.example.com/", "getHi");
    private final static QName _GetHiResponse_QNAME = new QName("http://api.vehicles.example.com/", "getHiResponse");
    private final static QName _GetNameLike_QNAME = new QName("http://api.vehicles.example.com/", "getNameLike");
    private final static QName _GetNameLikeResponse_QNAME = new QName("http://api.vehicles.example.com/", "getNameLikeResponse");
    private final static QName _GetVehicleById_QNAME = new QName("http://api.vehicles.example.com/", "getVehicleById");
    private final static QName _GetVehicleByIdResponse_QNAME = new QName("http://api.vehicles.example.com/", "getVehicleByIdResponse");
    private final static QName _GetVehicles_QNAME = new QName("http://api.vehicles.example.com/", "getVehicles");
    private final static QName _GetVehiclesResponse_QNAME = new QName("http://api.vehicles.example.com/", "getVehiclesResponse");
    private final static QName _Hello_QNAME = new QName("http://api.vehicles.example.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://api.vehicles.example.com/", "helloResponse");
    private final static QName _UpdateVehicle_QNAME = new QName("http://api.vehicles.example.com/", "updateVehicle");
    private final static QName _UpdateVehicleResponse_QNAME = new QName("http://api.vehicles.example.com/", "updateVehicleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.vehicles.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddVehicle }
     * 
     */
    public AddVehicle createAddVehicle() {
        return new AddVehicle();
    }

    /**
     * Create an instance of {@link AddVehicleResponse }
     * 
     */
    public AddVehicleResponse createAddVehicleResponse() {
        return new AddVehicleResponse();
    }

    /**
     * Create an instance of {@link DeleteVehicle }
     * 
     */
    public DeleteVehicle createDeleteVehicle() {
        return new DeleteVehicle();
    }

    /**
     * Create an instance of {@link DeleteVehicleResponse }
     * 
     */
    public DeleteVehicleResponse createDeleteVehicleResponse() {
        return new DeleteVehicleResponse();
    }

    /**
     * Create an instance of {@link GetEnginePowerMoreThan }
     * 
     */
    public GetEnginePowerMoreThan createGetEnginePowerMoreThan() {
        return new GetEnginePowerMoreThan();
    }

    /**
     * Create an instance of {@link GetEnginePowerMoreThanResponse }
     * 
     */
    public GetEnginePowerMoreThanResponse createGetEnginePowerMoreThanResponse() {
        return new GetEnginePowerMoreThanResponse();
    }

    /**
     * Create an instance of {@link GetEnginePowerSum }
     * 
     */
    public GetEnginePowerSum createGetEnginePowerSum() {
        return new GetEnginePowerSum();
    }

    /**
     * Create an instance of {@link GetEnginePowerSumResponse }
     * 
     */
    public GetEnginePowerSumResponse createGetEnginePowerSumResponse() {
        return new GetEnginePowerSumResponse();
    }

    /**
     * Create an instance of {@link GetHi }
     * 
     */
    public GetHi createGetHi() {
        return new GetHi();
    }

    /**
     * Create an instance of {@link GetHiResponse }
     * 
     */
    public GetHiResponse createGetHiResponse() {
        return new GetHiResponse();
    }

    /**
     * Create an instance of {@link GetNameLike }
     * 
     */
    public GetNameLike createGetNameLike() {
        return new GetNameLike();
    }

    /**
     * Create an instance of {@link GetNameLikeResponse }
     * 
     */
    public GetNameLikeResponse createGetNameLikeResponse() {
        return new GetNameLikeResponse();
    }

    /**
     * Create an instance of {@link GetVehicleById }
     * 
     */
    public GetVehicleById createGetVehicleById() {
        return new GetVehicleById();
    }

    /**
     * Create an instance of {@link GetVehicleByIdResponse }
     * 
     */
    public GetVehicleByIdResponse createGetVehicleByIdResponse() {
        return new GetVehicleByIdResponse();
    }

    /**
     * Create an instance of {@link GetVehicles }
     * 
     */
    public GetVehicles createGetVehicles() {
        return new GetVehicles();
    }

    /**
     * Create an instance of {@link GetVehiclesResponse }
     * 
     */
    public GetVehiclesResponse createGetVehiclesResponse() {
        return new GetVehiclesResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link UpdateVehicle }
     * 
     */
    public UpdateVehicle createUpdateVehicle() {
        return new UpdateVehicle();
    }

    /**
     * Create an instance of {@link UpdateVehicleResponse }
     * 
     */
    public UpdateVehicleResponse createUpdateVehicleResponse() {
        return new UpdateVehicleResponse();
    }

    /**
     * Create an instance of {@link LongResponse }
     * 
     */
    public LongResponse createLongResponse() {
        return new LongResponse();
    }

    /**
     * Create an instance of {@link DefaultResponse }
     * 
     */
    public DefaultResponse createDefaultResponse() {
        return new DefaultResponse();
    }

    /**
     * Create an instance of {@link VehicleDtoResponse }
     * 
     */
    public VehicleDtoResponse createVehicleDtoResponse() {
        return new VehicleDtoResponse();
    }

    /**
     * Create an instance of {@link VehicleDto }
     * 
     */
    public VehicleDto createVehicleDto() {
        return new VehicleDto();
    }

    /**
     * Create an instance of {@link CoordinatesDto }
     * 
     */
    public CoordinatesDto createCoordinatesDto() {
        return new CoordinatesDto();
    }

    /**
     * Create an instance of {@link VehicleToModifyDto }
     * 
     */
    public VehicleToModifyDto createVehicleToModifyDto() {
        return new VehicleToModifyDto();
    }

    /**
     * Create an instance of {@link VehicleToModifyResponse }
     * 
     */
    public VehicleToModifyResponse createVehicleToModifyResponse() {
        return new VehicleToModifyResponse();
    }

    /**
     * Create an instance of {@link TotalCountDtoResponse }
     * 
     */
    public TotalCountDtoResponse createTotalCountDtoResponse() {
        return new TotalCountDtoResponse();
    }

    /**
     * Create an instance of {@link TotalCountDto }
     * 
     */
    public TotalCountDto createTotalCountDto() {
        return new TotalCountDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "addVehicle")
    public JAXBElement<AddVehicle> createAddVehicle(AddVehicle value) {
        return new JAXBElement<AddVehicle>(_AddVehicle_QNAME, AddVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVehicleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddVehicleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "addVehicleResponse")
    public JAXBElement<AddVehicleResponse> createAddVehicleResponse(AddVehicleResponse value) {
        return new JAXBElement<AddVehicleResponse>(_AddVehicleResponse_QNAME, AddVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "deleteVehicle")
    public JAXBElement<DeleteVehicle> createDeleteVehicle(DeleteVehicle value) {
        return new JAXBElement<DeleteVehicle>(_DeleteVehicle_QNAME, DeleteVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVehicleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteVehicleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "deleteVehicleResponse")
    public JAXBElement<DeleteVehicleResponse> createDeleteVehicleResponse(DeleteVehicleResponse value) {
        return new JAXBElement<DeleteVehicleResponse>(_DeleteVehicleResponse_QNAME, DeleteVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnginePowerMoreThan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnginePowerMoreThan }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getEnginePowerMoreThan")
    public JAXBElement<GetEnginePowerMoreThan> createGetEnginePowerMoreThan(GetEnginePowerMoreThan value) {
        return new JAXBElement<GetEnginePowerMoreThan>(_GetEnginePowerMoreThan_QNAME, GetEnginePowerMoreThan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnginePowerMoreThanResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnginePowerMoreThanResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getEnginePowerMoreThanResponse")
    public JAXBElement<GetEnginePowerMoreThanResponse> createGetEnginePowerMoreThanResponse(GetEnginePowerMoreThanResponse value) {
        return new JAXBElement<GetEnginePowerMoreThanResponse>(_GetEnginePowerMoreThanResponse_QNAME, GetEnginePowerMoreThanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnginePowerSum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnginePowerSum }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getEnginePowerSum")
    public JAXBElement<GetEnginePowerSum> createGetEnginePowerSum(GetEnginePowerSum value) {
        return new JAXBElement<GetEnginePowerSum>(_GetEnginePowerSum_QNAME, GetEnginePowerSum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnginePowerSumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnginePowerSumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getEnginePowerSumResponse")
    public JAXBElement<GetEnginePowerSumResponse> createGetEnginePowerSumResponse(GetEnginePowerSumResponse value) {
        return new JAXBElement<GetEnginePowerSumResponse>(_GetEnginePowerSumResponse_QNAME, GetEnginePowerSumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHi }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getHi")
    public JAXBElement<GetHi> createGetHi(GetHi value) {
        return new JAXBElement<GetHi>(_GetHi_QNAME, GetHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getHiResponse")
    public JAXBElement<GetHiResponse> createGetHiResponse(GetHiResponse value) {
        return new JAXBElement<GetHiResponse>(_GetHiResponse_QNAME, GetHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameLike }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNameLike }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getNameLike")
    public JAXBElement<GetNameLike> createGetNameLike(GetNameLike value) {
        return new JAXBElement<GetNameLike>(_GetNameLike_QNAME, GetNameLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameLikeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNameLikeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getNameLikeResponse")
    public JAXBElement<GetNameLikeResponse> createGetNameLikeResponse(GetNameLikeResponse value) {
        return new JAXBElement<GetNameLikeResponse>(_GetNameLikeResponse_QNAME, GetNameLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVehicleById }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getVehicleById")
    public JAXBElement<GetVehicleById> createGetVehicleById(GetVehicleById value) {
        return new JAXBElement<GetVehicleById>(_GetVehicleById_QNAME, GetVehicleById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVehicleByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getVehicleByIdResponse")
    public JAXBElement<GetVehicleByIdResponse> createGetVehicleByIdResponse(GetVehicleByIdResponse value) {
        return new JAXBElement<GetVehicleByIdResponse>(_GetVehicleByIdResponse_QNAME, GetVehicleByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVehicles }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getVehicles")
    public JAXBElement<GetVehicles> createGetVehicles(GetVehicles value) {
        return new JAXBElement<GetVehicles>(_GetVehicles_QNAME, GetVehicles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehiclesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVehiclesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "getVehiclesResponse")
    public JAXBElement<GetVehiclesResponse> createGetVehiclesResponse(GetVehiclesResponse value) {
        return new JAXBElement<GetVehiclesResponse>(_GetVehiclesResponse_QNAME, GetVehiclesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "updateVehicle")
    public JAXBElement<UpdateVehicle> createUpdateVehicle(UpdateVehicle value) {
        return new JAXBElement<UpdateVehicle>(_UpdateVehicle_QNAME, UpdateVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVehicleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVehicleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://api.vehicles.example.com/", name = "updateVehicleResponse")
    public JAXBElement<UpdateVehicleResponse> createUpdateVehicleResponse(UpdateVehicleResponse value) {
        return new JAXBElement<UpdateVehicleResponse>(_UpdateVehicleResponse_QNAME, UpdateVehicleResponse.class, null, value);
    }

}
