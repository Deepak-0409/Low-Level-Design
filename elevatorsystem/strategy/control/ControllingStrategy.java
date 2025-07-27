package com.practice.java.lld.elevatorsystem.strategy.control;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.ElevatorController;

public interface ControllingStrategy {
    void addRequest(int floor, Direction dir);
    void move(ElevatorController controller);
}
