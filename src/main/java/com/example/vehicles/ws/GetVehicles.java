
package com.example.vehicles.ws;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVehicles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVehicles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="page-size" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sort-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="f-id" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-date" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-wheels-number" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-mileage" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-engine-power" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-fuel-consumption" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-x" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-y" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-vehicle-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="f-fuel-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicles", propOrder = {
    "page",
    "pageSize",
    "sort",
    "sortType",
    "fId",
    "fName",
    "fDate",
    "fWheelsNumber",
    "fMileage",
    "fEnginePower",
    "fFuelConsumption",
    "fx",
    "fy",
    "fVehicleType",
    "fFuelType"
})
public class GetVehicles {

    protected int page;
    @XmlElement(name = "page-size")
    protected int pageSize;
    protected String sort;
    @XmlElement(name = "sort-type")
    protected String sortType;
    @XmlElement(name = "f-id", type = Long.class)
    protected List<Long> fId;
    @XmlElement(name = "f-name")
    protected List<String> fName;
    @XmlElement(name = "f-date")
    protected List<String> fDate;
    @XmlElement(name = "f-wheels-number", type = Integer.class)
    protected List<Integer> fWheelsNumber;
    @XmlElement(name = "f-mileage", type = Integer.class)
    protected List<Integer> fMileage;
    @XmlElement(name = "f-engine-power", type = Integer.class)
    protected List<Integer> fEnginePower;
    @XmlElement(name = "f-fuel-consumption", type = Double.class)
    protected List<Double> fFuelConsumption;
    @XmlElement(name = "f-x", type = Double.class)
    protected List<Double> fx;
    @XmlElement(name = "f-y", type = Long.class)
    protected List<Long> fy;
    @XmlElement(name = "f-vehicle-type")
    protected List<String> fVehicleType;
    @XmlElement(name = "f-fuel-type")
    protected List<String> fFuelType;

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String value) {
        this.sort = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortType(String value) {
        this.sortType = value;
    }

    /**
     * Gets the value of the fId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getFId() {
        if (fId == null) {
            fId = new ArrayList<Long>();
        }
        return this.fId;
    }

    /**
     * Gets the value of the fName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFName() {
        if (fName == null) {
            fName = new ArrayList<String>();
        }
        return this.fName;
    }

    /**
     * Gets the value of the fDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFDate() {
        if (fDate == null) {
            fDate = new ArrayList<String>();
        }
        return this.fDate;
    }

    /**
     * Gets the value of the fWheelsNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fWheelsNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFWheelsNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFWheelsNumber() {
        if (fWheelsNumber == null) {
            fWheelsNumber = new ArrayList<Integer>();
        }
        return this.fWheelsNumber;
    }

    /**
     * Gets the value of the fMileage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fMileage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFMileage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFMileage() {
        if (fMileage == null) {
            fMileage = new ArrayList<Integer>();
        }
        return this.fMileage;
    }

    /**
     * Gets the value of the fEnginePower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fEnginePower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEnginePower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getFEnginePower() {
        if (fEnginePower == null) {
            fEnginePower = new ArrayList<Integer>();
        }
        return this.fEnginePower;
    }

    /**
     * Gets the value of the fFuelConsumption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fFuelConsumption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFFuelConsumption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getFFuelConsumption() {
        if (fFuelConsumption == null) {
            fFuelConsumption = new ArrayList<Double>();
        }
        return this.fFuelConsumption;
    }

    /**
     * Gets the value of the fx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getFX() {
        if (fx == null) {
            fx = new ArrayList<Double>();
        }
        return this.fx;
    }

    /**
     * Gets the value of the fy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getFY() {
        if (fy == null) {
            fy = new ArrayList<Long>();
        }
        return this.fy;
    }

    /**
     * Gets the value of the fVehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fVehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFVehicleType() {
        if (fVehicleType == null) {
            fVehicleType = new ArrayList<String>();
        }
        return this.fVehicleType;
    }

    /**
     * Gets the value of the fFuelType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fFuelType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFFuelType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFFuelType() {
        if (fFuelType == null) {
            fFuelType = new ArrayList<String>();
        }
        return this.fFuelType;
    }

}
