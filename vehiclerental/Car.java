package com.practice.java.lld.vehiclerental;

public class Car extends Vehicle{

    public Car(int id, String number) {
        super(id,number,VehicleType.CAR,VehicleStatus.ACTIVE);
    }
}
