package com.practice.java.lld.bookmyshow;

import com.practice.java.lld.bookmyshow.model.Location;
import com.practice.java.lld.bookmyshow.model.Movie;

public class Main {
    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.createBooking(new Movie(),new Location());
    }
}
