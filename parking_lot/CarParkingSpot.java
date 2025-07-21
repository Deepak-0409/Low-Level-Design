package com.practice.java.lld.parking_lot;

public class CarParkingSpot extends ParkingSpot{
    public CarParkingSpot(String id, PricingStrategy pricingStrategy) {
        super(id, ParkingSpotType.CAR, 20, pricingStrategy);
    }
}
