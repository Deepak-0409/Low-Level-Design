package com.practice.java.lld.elevatorsystem.strategy.selection;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.ElevatorController;

public interface SelectionStrategy {
    ElevatorController selectElevator(int floor, Direction dir);
}
