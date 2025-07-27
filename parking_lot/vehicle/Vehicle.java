package com.practice.java.lld.parking_lot.vehicle;

public class Vehicle {
    private VehicleType vehicleType;
    private String licenseNumber;

    public Vehicle(VehicleType vehicleType, String licenseNumber) {
        this.vehicleType = vehicleType;
        this.licenseNumber = licenseNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

}
