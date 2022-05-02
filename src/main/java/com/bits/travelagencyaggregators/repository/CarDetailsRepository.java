package com.bits.travelagencyaggregators.repository;

import com.bits.travelagencyaggregators.model.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface CarDetailsRepository extends JpaRepository<CarDetails, Integer> {

    @Query("SELECT c FROM CarDetails c LEFT JOIN Availability a ON c.id = a.id WHERE (a.id IS NULL OR (a.fromDate > :endDate OR a.toDate < :startDate)) AND c.location = :location")
    List<CarDetails> findByAvailability(@Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("location") String location);

    CarDetails save(CarDetails carDetails);
}
