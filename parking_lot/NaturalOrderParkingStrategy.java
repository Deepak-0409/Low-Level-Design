package com.practice.java.lld.parking_lot;

import java.util.List;

public class NaturalOrderParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot park(List<ParkingSpot> availableSpaces) {
        return availableSpaces.get(0);
    }
}
