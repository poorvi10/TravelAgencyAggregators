package com.bits.travelagencyaggregators.repository;

import com.bits.travelagencyaggregators.model.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Integer> {
    BookingDetails save(BookingDetails bookingDetails);
}
