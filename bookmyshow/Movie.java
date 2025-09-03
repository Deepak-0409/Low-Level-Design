package com.practice.java.lld.bookmyshow;

public class Movie {
    int id;
    String name;
    long duration;
    //other details like cast, releasedate ,etc

    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
