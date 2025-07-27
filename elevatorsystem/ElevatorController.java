package com.practice.java.lld.elevatorsystem;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.model.elevatorcar.ElevatorCar;
import com.practice.java.lld.elevatorsystem.strategy.control.ControllingStrategy;

public class ElevatorController {
    private int id;
    private ElevatorCar elevatorCar;
    private ControllingStrategy controllingStrategy;

    public ElevatorController(int id, ElevatorCar elevatorCar, ControllingStrategy controllingStrategy) {
        this.id = id;
        this.elevatorCar = elevatorCar;
        this.controllingStrategy = controllingStrategy;
    }

    public void setControllingStrategy(ControllingStrategy controllingStrategy) {
        this.controllingStrategy = controllingStrategy;
    }

    public int getId() {
        return id;
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void acceptRequest(int floor, Direction dir) {
        controllingStrategy.addRequest(floor, dir);
        controlCar();
    }

    private void controlCar() {
        // use control strategy to serve pending requests
        controllingStrategy.move(this);
    }

}
