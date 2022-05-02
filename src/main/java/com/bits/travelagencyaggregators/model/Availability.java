package com.bits.travelagencyaggregators.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "availability")
public class Availability {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "car_id")
    String carId;

    @Column(name = "from_date")
    Date fromDate;

    @Column(name = "to_date")
    Date toDate;

    public Availability(int id, String carId, Date fromDate, Date toDate) {
        this.id = id;
        this.carId = carId;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Availability() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
