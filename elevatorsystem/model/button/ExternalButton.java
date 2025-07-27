package com.practice.java.lld.elevatorsystem.model.button;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.requestdispatcher.ExternalRequestDispatcher;

public class ExternalButton extends Button{
    private ExternalRequestDispatcher externalRequestDispatcher = ExternalRequestDispatcher.INSTANCE;
    @Override
    public void pressButton(Direction dir, int floorId) {
        externalRequestDispatcher.submitRequest(floorId, dir);
    }
}
