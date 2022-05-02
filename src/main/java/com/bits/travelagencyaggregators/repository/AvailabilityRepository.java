package com.bits.travelagencyaggregators.repository;

import com.bits.travelagencyaggregators.model.Availability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailabilityRepository extends JpaRepository<Availability, Integer> {
    Availability save(Availability availability);
}
