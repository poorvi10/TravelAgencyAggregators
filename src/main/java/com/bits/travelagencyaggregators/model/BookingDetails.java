package com.bits.travelagencyaggregators.model;
import javax.persistence.*;

@Entity
@Table(name = "booking_details")
public class BookingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "customer_id")
    String customerId;

    @Column(name = "agency_id")
    String agencyId;

    @Column(name = "agency_name")
    String agencyName;

    public BookingDetails(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Column(name = "booking_dateTime")
    String bookingDateTime;

    @Column(name = "city_id")
    String cityId;

    @Column(name = "from_location_id")
    String fromLocationId;

    @Column(name = "to_location_id")
    String toLocationId;

    @Column(name = "payment_details")
    String paymentDetails;

    @Column(name = "booking_cancelled_id")
    String bookingCancelledId;

    @Column(name = "driver_id")
    String driverId;

    public BookingDetails(int id, String customerId, String agencyId, String agencyName, String bookingDateTime, String cityId, String fromLocationId, String toLocationId, String paymentDetails, String bookingCancelledId, String driverId) {
        this.id = id;
        this.customerId = customerId;
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.bookingDateTime = bookingDateTime;
        this.cityId = cityId;
        this.fromLocationId = fromLocationId;
        this.toLocationId = toLocationId;
        this.paymentDetails = paymentDetails;
        this.bookingCancelledId = bookingCancelledId;
        this.driverId = driverId;
    }

    public BookingDetails() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(String bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getFromLocationId() {
        return fromLocationId;
    }

    public void setFromLocationId(String fromLocationId) {
        this.fromLocationId = fromLocationId;
    }

    public String getToLocationId() {
        return toLocationId;
    }

    public void setToLocationId(String toLocationId) {
        this.toLocationId = toLocationId;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public String getBookingCancelledId() {
        return bookingCancelledId;
    }

    public void setBookingCancelledId(String bookingCancelledId) {
        this.bookingCancelledId = bookingCancelledId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
}
