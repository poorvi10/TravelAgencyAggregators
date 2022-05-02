package com.bits.travelagencyaggregators.handler;

import com.bits.travelagencyaggregators.model.CarDetails;
import com.bits.travelagencyaggregators.model.TravelAgency;
import com.bits.travelagencyaggregators.repository.CarDetailsRepository;
import com.bits.travelagencyaggregators.repository.TravelAgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class AgencyHandler {

    @Autowired
    TravelAgencyRepository travelAgencyRepository;

    @Autowired
    CarDetailsRepository carDetailsRepository;

    public Mono<ServerResponse> saveAgency(ServerRequest req) {
        Mono<ServerResponse> response = req.bodyToMono(TravelAgency.class).flatMap(body -> {
            try {
                travelAgencyRepository.save(body);
                return ServerResponse.ok().bodyValue("Data saved");
            } catch (Exception e) {
                return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).bodyValue("Data saved");
            }
        });
        return response;
    }

    public Mono<ServerResponse> saveAgencyCar(ServerRequest req) {
        Mono<ServerResponse> response = req.bodyToMono(CarDetails.class).flatMap(body -> {
            try {
                carDetailsRepository.save(body);
                return ServerResponse.ok().bodyValue("Data saved");
            } catch (Exception e) {
                return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).bodyValue("Data saved");
            }
        });
        return response;
    }
}
