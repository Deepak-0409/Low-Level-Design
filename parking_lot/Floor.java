package com.practice.java.lld.parking_lot;

import java.util.List;

public class Floor {

    private ParkingSpotManager parkingSpotManager;
    private String floor_id;


    public Floor(String floor_id) {
        this.parkingSpotManager = new ParkingSpotManager();
        this.floor_id = floor_id;
    }

    public String getFloor_id() {
        return floor_id;
    }

    public boolean isParkingAvailable(Vehicle vehicle) {
        return parkingSpotManager.isParkingSpotAvailableByVehicleType(vehicle);
    }

    public List<ParkingSpot> getSpace(Vehicle vehicle) {
        return parkingSpotManager.getSpace(vehicle);
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotManager.addParkingSpot(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotManager.removeParkingSpot(parkingSpot);
    }
}
