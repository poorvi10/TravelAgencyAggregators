package com.bits.travelagencyaggregators.repository;

import com.bits.travelagencyaggregators.model.TravelAgency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelAgencyRepository extends JpaRepository<TravelAgency, Integer> {
    TravelAgency save(TravelAgency travelAgency);
}
