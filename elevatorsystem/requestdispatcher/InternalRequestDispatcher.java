package com.practice.java.lld.elevatorsystem.requestdispatcher;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.ElevatorController;
import com.practice.java.lld.elevatorsystem.ElevatorSystem;

import java.util.Optional;

public class InternalRequestDispatcher {

    public static InternalRequestDispatcher INSTANCE = new InternalRequestDispatcher();
    private InternalRequestDispatcher() {
    }

    public void submitRequest(Direction dir, int destinationFloorId, int elevatorId) {
        Optional<ElevatorController> controller = ElevatorSystem.getInstance().getControllers().stream().filter(p -> p.getId() == elevatorId).findFirst();
        controller.ifPresent(elevatorController -> elevatorController.acceptRequest(destinationFloorId, dir));
        //exception handling
    }

}
