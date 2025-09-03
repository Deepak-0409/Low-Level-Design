package com.practice.java.lld.bookmyshow.model;

import java.sql.Time;
import java.util.List;

public class Show {
    int id;
    Movie movie;
    Time startTime;
    Time endTime;
    Screen screen;
    List<Integer> bookedSeatId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Integer> getBookedSeatId() {
        return bookedSeatId;
    }

    public void setBookedSeatId(List<Integer> bookedSeatId) {
        this.bookedSeatId = bookedSeatId;
    }
}
