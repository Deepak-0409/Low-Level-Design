package com.practice.java.lld.parking_lot.parking_spot;

import com.practice.java.lld.parking_lot.pricing_strategy.PricingStrategy;

public class CarParkingSpot extends ParkingSpot{
    public CarParkingSpot(String id, PricingStrategy pricingStrategy) {
        super(id, ParkingSpotType.CAR, 20, pricingStrategy);
    }
}
