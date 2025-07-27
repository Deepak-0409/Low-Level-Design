package com.practice.java.lld.parking_lot.parking_spot;

import com.practice.java.lld.parking_lot.pricing_strategy.PricingStrategy;

public class BikeParkingSpot extends ParkingSpot{
    public BikeParkingSpot(String id, PricingStrategy pricingStrategy) {
        super(id, ParkingSpotType.BIKE,10, pricingStrategy);
    }
}
