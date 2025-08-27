package com.practice.java.lld.vehiclerental;

public abstract class Vehicle {
    int id;
    String vehicleNo;
    VehicleType type;
    VehicleStatus status;
    //Other metadata - engine/chasis number, company,etc;

    public Vehicle(int id, String vehicleNo, VehicleType type, VehicleStatus status) {
        this.id = id;
        this.vehicleNo = vehicleNo;
        this.type = type;
        this.status = status;
    }
}
