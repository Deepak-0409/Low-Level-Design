package com.practice.java.lld.bookmyshow;

import java.sql.Time;
import java.util.List;

public class Show {
    int id;
    Movie movie;
    Time startTime;
    Time endTime;
    Screen screen;
    List<Integer> bookedSeatId;
}
