package com.practice.java.lld.elevatorsystem.strategy.selection;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.ElevatorController;

public class OddEvenSelectionStrategy implements SelectionStrategy{
    public static OddEvenSelectionStrategy INSTANCE = new OddEvenSelectionStrategy();

    private OddEvenSelectionStrategy() {}

    @Override
    public ElevatorController selectElevator(int floor, Direction dir) {
//        old elevator for odd floors and even elevators for even floors
//        select elevator which is moving in same direction which is requested or IDLE elevator
//         if(floor%2 == eController.getId()%2)
//         {
//             int currFloor= eController.getElevatorCar().getCurrentFloor();
//             Direction currDir= eController.getElevatorCar().getDir();
//             if(floor>currFloor && currDir==Direction.UP)
//                 return eController;
//             else if(floor<currFloor && currDir==Direction.DOWN)
//                 return eController;
//             else if(currDir==Direction.NONE)
//                 return eController;
//
//         }

        return list.get(0);
    }
}
