package com.practice.java.lld.elevatorsystem.model.floor;

import com.practice.java.lld.elevatorsystem.enums.Direction;
import com.practice.java.lld.elevatorsystem.model.button.Button;
import com.practice.java.lld.elevatorsystem.model.button.ExternalButton;
import com.practice.java.lld.elevatorsystem.model.display.Display;

public class Floor {
    private Display display = new Display(Direction.NONE,0);
    private int id;
    private Button button = new ExternalButton();

    public Floor(int id) {
        this.id = id;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void pressButton(Direction dir) {
        button.pressButton(dir,id);
    }
}
