package com.bits.travelagencyaggregators.repository;

import com.bits.travelagencyaggregators.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer> {
    CustomerDetails findByUname (String uname);
}
