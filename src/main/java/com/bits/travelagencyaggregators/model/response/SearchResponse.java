package com.bits.travelagencyaggregators.model.response;

import com.bits.travelagencyaggregators.model.CarDetails;

import java.util.List;

public class SearchResponse {
    private List<CarDetails> cars;

    public List<CarDetails> getCars() {
        return cars;
    }

    public void setCars(List<CarDetails> cars) {
        this.cars = cars;
    }
}
