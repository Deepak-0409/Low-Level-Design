package com.practice.java.lld.parking_lot.parking_strategy;

import com.practice.java.lld.parking_lot.parking_spot.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot park(List<ParkingSpot> availableSpaces);
}
