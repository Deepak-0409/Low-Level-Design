package com.practice.java.lld.vehiclerental;

import java.util.List;

public class VehicleInventory {
    List<Vehicle> vehicles;

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
