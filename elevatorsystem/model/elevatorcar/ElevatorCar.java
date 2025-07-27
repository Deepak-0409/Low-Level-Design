package com.practice.java.lld.elevatorsystem.model.elevatorcar;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.enums.State;
import com.practice.java.lld.elevatorsystem.model.button.Button;
import com.practice.java.lld.elevatorsystem.model.button.InternalButton;
import com.practice.java.lld.elevatorsystem.model.display.Display;
import com.practice.java.lld.elevatorsystem.model.doors.Doors;

public class ElevatorCar {
    private Doors doors = new Doors();
    private Button button = new InternalButton();
    private Display display = new Display(Direction.NONE, 0);
    private Direction direction = Direction.NONE;
    private State state = State.IDLE;
    private int currentFloor = 0;
    private int id;

    public ElevatorCar(int id) {
        this.id = id;
    }

    //show display
    public void showDisplay() {};

    //pressButton
    public void pressButton(int floor) {
        Direction dir = Direction.NONE;
        if(floor>currentFloor)
            dir = Direction.UP;
        else if(floor<currentFloor)
            dir = Direction.DOWN;

        if(dir!=Direction.NONE)
            button.pressButton(dir,floor,id);
    }

    public void move(int floor, Direction dir) {
        //move the car
    }
}
