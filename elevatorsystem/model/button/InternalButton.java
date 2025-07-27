package com.practice.java.lld.elevatorsystem.model.button;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.requestdispatcher.InternalRequestDispatcher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InternalButton extends Button{
    private InternalRequestDispatcher internalRequestDispatcher = InternalRequestDispatcher.INSTANCE;
    //set is used to avoid duplicate buttons
    private Set<Integer> buttonsList = new HashSet<>(new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9)));

    @Override
    public void pressButton(Direction dir, int destinationFloorId, int elevatorId) {
        //check if floorId is present in buttonsList

        internalRequestDispatcher.submitRequest(dir,destinationFloorId,elevatorId);
    }
}
