package com.bits.travelagencyaggregators.model;
import javax.persistence.*;

@Entity
@Table(name = "car_details")
public class CarDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "agency_id")
    String agencyId;

    @Column(name = "agency_name")
    String agencyName;

    @Column(name = "car_name")
    String carName;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_company")
    private String carCompany;

    @Column(name = "ac_nonAC")
    private String acNonAc;

    @Column(name = "car_photo")
    private String carPhoto;

    @Column(name = "car_type")
    private String carType;

    @Column(name = "driver_linked_id")
    private String driverLinkedId;

    @Column(name = "min_fare")
    private String minFare;

    @Column(name = "rs_per_km")
    private String rsPerKm;

    @Column(name = "base_fare")
    private String baseFare;

    @Column(name = "location")
    private String location;

    public CarDetails(int id, String agencyId, String agencyName, String carName, String carModel, String carCompany, String acNonAc, String carPhoto, String carType, String driverLinkedId, String minFare, String rsPerKm, String baseFare, String location) {
        this.id = id;
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.carName = carName;
        this.carModel = carModel;
        this.carCompany = carCompany;
        this.acNonAc = acNonAc;
        this.carPhoto = carPhoto;
        this.carType = carType;
        this.driverLinkedId = driverLinkedId;
        this.minFare = minFare;
        this.rsPerKm = rsPerKm;
        this.baseFare = baseFare;
        this.location = location;
    }

    public CarDetails() {
    }


    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getAcNonAc() {
        return acNonAc;
    }

    public void setAcNonAc(String acNonAc) {
        this.acNonAc = acNonAc;
    }

    public String getCarPhoto() {
        return carPhoto;
    }

    public void setCarPhoto(String carPhoto) {
        this.carPhoto = carPhoto;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getDriverLinkedId() {
        return driverLinkedId;
    }

    public void setDriverLinkedId(String driverLinkedId) {
        this.driverLinkedId = driverLinkedId;
    }

    public String getMinFare() {
        return minFare;
    }

    public void setMinFare(String minFare) {
        this.minFare = minFare;
    }

    public String getRsPerKm() {
        return rsPerKm;
    }

    public void setRsPerKm(String rsPerKm) {
        this.rsPerKm = rsPerKm;
    }

    public String getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(String baseFare) {
        this.baseFare = baseFare;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
