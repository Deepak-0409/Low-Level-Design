package com.practice.java.lld.elevatorsystem;

import com.practice.java.lld.elevatorsystem.model.elevatorcar.ElevatorCar;
import com.practice.java.lld.elevatorsystem.model.floor.Floor;
import com.practice.java.lld.elevatorsystem.strategy.control.FirstComeFirstServeControllingStrategy;

public class Main {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();

        Floor f1 = new Floor(1);

        ElevatorCar elevatorCar = new ElevatorCar(1);
        ElevatorController elevatorController = new ElevatorController(1,elevatorCar,new FirstComeFirstServeControllingStrategy());

        elevatorSystem.addFloor(f1);
        elevatorSystem.addElevatorController(elevatorController);

        //perform actions
    }
}
