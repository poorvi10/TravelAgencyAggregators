package com.bits.travelagencyaggregators.handler;

import com.bits.travelagencyaggregators.model.CarDetails;
import com.bits.travelagencyaggregators.model.CustomerDetails;
import com.bits.travelagencyaggregators.model.response.GeneralResponse;
import com.bits.travelagencyaggregators.model.request.SearchRequest;
import com.bits.travelagencyaggregators.model.response.SearchResponse;
import com.bits.travelagencyaggregators.repository.CarDetailsRepository;
import com.bits.travelagencyaggregators.repository.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CustomerHandler {

    @Autowired
    CustomerDetailsRepository customerDetailsRepository;

    @Autowired
    CarDetailsRepository carDetailsRepository;

    @CrossOrigin
    public Mono<ServerResponse> checkCustomer(ServerRequest req) {
        Mono<ServerResponse> response = req.bodyToMono(CustomerDetails.class).flatMap(body -> {
            try {
                CustomerDetails customer = customerDetailsRepository.findByUname(body.getUname());
                if(customer == null) {
                    return ServerResponse.status(HttpStatus.UNAUTHORIZED).bodyValue("Username is incorrect");
                }
                String password = customer.getPassword();
                if(password != null && password.equals(body.getPassword())) {
                    GeneralResponse res = new GeneralResponse();
                    res.setMesssage("Logged in successfully");
                    return ServerResponse.ok().bodyValue(res);
                } else {
                    return ServerResponse.status(HttpStatus.UNAUTHORIZED).bodyValue("Password is incorrect");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).bodyValue("Error");
            }
        });
        return response;
    }

    @CrossOrigin
    public Mono<ServerResponse> carSearch(ServerRequest request) {
        Mono<ServerResponse> response = request.bodyToMono(SearchRequest.class).flatMap(req -> {
            try {
                List<CarDetails> cars = carDetailsRepository.findByAvailability(req.getStartDate(), req.getEndDate(), req.getLocation());
                SearchResponse res = new SearchResponse();
                res.setCars(cars);
                return ServerResponse.ok().bodyValue(res);
            } catch (Exception e) {
                e.printStackTrace();
                return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        });
        return response;
    }
}
