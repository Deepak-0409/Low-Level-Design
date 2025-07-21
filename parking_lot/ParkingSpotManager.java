package com.practice.java.lld.parking_lot;

import java.util.*;

public class ParkingSpotManager {
    Map<ParkingSpotType, List<ParkingSpot>> parkingSpots;

    ParkingSpotManager() {
        parkingSpots = new HashMap<>();
        parkingSpots.put(ParkingSpotType.BIKE, new ArrayList<>());
        parkingSpots.put(ParkingSpotType.CAR, new ArrayList<>());
        parkingSpots.put(ParkingSpotType.HEAVY, new ArrayList<>());
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.get(parkingSpot.getParkingSpotType()).add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.get(parkingSpot.getParkingSpotType()).remove(parkingSpot);
    }

    public boolean isParkingSpotAvailableByVehicleType(Vehicle vehicle) {
        return isParkingSpotAvailableByParkingSpotType(getParkingSpotTypeByVehicleType(vehicle));
    }
    public boolean isParkingSpotAvailableByParkingSpotType(ParkingSpotType parkingSpotType) {
        for(ParkingSpot p: parkingSpots.get(parkingSpotType)) {
            if(p!=null && p.isEmpty())
                return true;
        }

        return false;
    }

    private ParkingSpotType getParkingSpotTypeByVehicleType(Vehicle vehicle) {
        if(VehicleType.TWOWHEELER == vehicle.getVehicleType()) {
            return ParkingSpotType.BIKE;
        } else if(VehicleType.FOURWHEELER == vehicle.getVehicleType()) {
            return ParkingSpotType.CAR;
        }

        return ParkingSpotType.HEAVY;
    }

    public List<ParkingSpot> getSpace(Vehicle vehicle) {
        List<ParkingSpot>availableSpace = parkingSpots.get(getParkingSpotTypeByVehicleType(vehicle)).stream().filter(ParkingSpot::isEmpty).toList();

        if(availableSpace.isEmpty()) {
            System.out.println("No Parking Spot Available");
            return null;
        }

        return availableSpace;
    }

}
