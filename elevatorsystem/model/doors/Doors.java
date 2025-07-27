package com.practice.java.lld.elevatorsystem.model.doors;

public class Doors {
    public boolean isClosed=true;

    public void openGate() {
        isClosed=false;
        System.out.println("Gates are opening");
    }

    public void closeGate() {
        isClosed=true;
        System.out.println("Gates are closing");
    }
}
