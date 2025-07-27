package com.practice.java.lld.elevatorsystem.requestdispatcher;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.ElevatorController;
import com.practice.java.lld.elevatorsystem.ElevatorSystem;

public class ExternalRequestDispatcher {
    public static ExternalRequestDispatcher INSTANCE = new ExternalRequestDispatcher();

    private ExternalRequestDispatcher() {}

    public void submitRequest(int floor, Direction dir) {
        ElevatorController controller = ElevatorSystem.getInstance().getSelectionStrategy().selectElevator(floor, dir);
        controller.acceptRequest(floor, dir);
    }
}
