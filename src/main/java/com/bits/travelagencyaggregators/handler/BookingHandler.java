package com.bits.travelagencyaggregators.handler;

import com.bits.travelagencyaggregators.model.BookingDetails;
import com.bits.travelagencyaggregators.model.CustomerDetails;
import com.bits.travelagencyaggregators.repository.BookingDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class BookingHandler {
    @Autowired
    BookingDetailsRepository bookingDetailsRepository;

    public Mono<ServerResponse> saveBookingDetail(ServerRequest req) {
        String userId = req.pathVariable("id");
        Mono<ServerResponse> response = req.bodyToMono(BookingDetails.class).flatMap(body -> {
            try {
                bookingDetailsRepository.save(body);
                return ServerResponse.ok().bodyValue("Booking details saved");
            } catch (Exception e) {
                e.printStackTrace();
                return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).bodyValue("Booking cannot be made");
            }
        });
        return response;
    }

}
