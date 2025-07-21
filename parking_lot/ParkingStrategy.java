package com.practice.java.lld.parking_lot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot park(List<ParkingSpot> availableSpaces);
}
