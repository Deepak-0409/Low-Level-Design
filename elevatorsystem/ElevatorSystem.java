package com.practice.java.lld.elevatorsystem;

import com.practice.java.lld.elevatorsystem.model.floor.Floor;
import com.practice.java.lld.elevatorsystem.strategy.selection.OddEvenSelectionStrategy;
import com.practice.java.lld.elevatorsystem.strategy.selection.SelectionStrategy;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private List<Floor> floors;
    private List<ElevatorController> controllers;
    private SelectionStrategy selectionStrategy;

    private static ElevatorSystem INSTANCE;


    private ElevatorSystem(SelectionStrategy selectionStrategy) {
        this.selectionStrategy = selectionStrategy;
        initialize();
    }

    public static ElevatorSystem getInstance() {
        if(INSTANCE!=null)
            return INSTANCE;

        return INSTANCE = new ElevatorSystem(OddEvenSelectionStrategy.INSTANCE);
    }

    public void initialize() {
        floors = new ArrayList<>();
        controllers = new ArrayList<>();
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public SelectionStrategy getSelectionStrategy() {
        return selectionStrategy;
    }

    public List<ElevatorController> getControllers() {
        return controllers;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    //remove floor

    public void addElevatorController(ElevatorController controller) {
        controllers.add(controller);
    }

    //remove controller

    public void setSelectionStrategy(SelectionStrategy selectionStrategy) {
        this.selectionStrategy = selectionStrategy;
    }

}
