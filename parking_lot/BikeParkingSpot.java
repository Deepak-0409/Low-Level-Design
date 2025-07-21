package com.practice.java.lld.parking_lot;

public class BikeParkingSpot extends ParkingSpot{
    public BikeParkingSpot(String id, PricingStrategy pricingStrategy) {
        super(id, ParkingSpotType.BIKE,10, pricingStrategy);
    }
}
