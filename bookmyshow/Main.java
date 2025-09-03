package com.practice.java.lld.bookmyshow;

public class Main {
    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.createBooking(new Movie(),new Location());
    }
}
