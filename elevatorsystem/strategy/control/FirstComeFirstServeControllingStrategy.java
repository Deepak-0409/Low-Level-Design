package com.practice.java.lld.elevatorsystem.strategy.control;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.ElevatorController;
import com.practice.java.lld.elevatorsystem.model.request.PendingRequest;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstComeFirstServeControllingStrategy implements ControllingStrategy {
    Queue<PendingRequest>pendingRequestsList = new ArrayDeque<>();

    @Override
    public void addRequest(int floor, Direction dir) {
        pendingRequestsList.add(new PendingRequest(dir,floor));
    }

    @Override
    public void move(ElevatorController controller) {
        PendingRequest request = pendingRequestsList.poll();
        if(request==null) {
            //set state of car to IDLE and direction none
        } else {
            controller.getElevatorCar().move(request.floor,request.dir);
        }
    }
}
