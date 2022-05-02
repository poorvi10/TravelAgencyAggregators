package com.bits.travelagencyaggregators.router;

import com.bits.travelagencyaggregators.handler.AgencyHandler;
import com.bits.travelagencyaggregators.handler.BookingHandler;
import com.bits.travelagencyaggregators.handler.CustomerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class AggregatorRouter {

    @Autowired
    AgencyHandler agencyHandler;

    @Autowired
    CustomerHandler customerHandler;

    @Autowired
    BookingHandler bookingHandler;

    @Bean
    public RouterFunction<ServerResponse> routerFunction() {
        return RouterFunctions.route()
                .POST("/agency/save", agencyHandler::saveAgency)
                .POST("/agency/car/save", agencyHandler::saveAgencyCar)
                .POST("/customer/check", customerHandler::checkCustomer)
                .POST("/customer/{id}/bookingDetails", bookingHandler::saveBookingDetail)
                .POST("/car/search", customerHandler::carSearch)
                .build();
    }
}
