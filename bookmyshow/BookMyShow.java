package com.practice.java.lld.bookmyshow;

import com.practice.java.lld.bookmyshow.controllers.MovieController;
import com.practice.java.lld.bookmyshow.controllers.TheatreController;
import com.practice.java.lld.bookmyshow.model.Location;
import com.practice.java.lld.bookmyshow.model.Movie;

import java.util.List;

public class BookMyShow {
    List<TheatreController> theatreControllers;
    List<MovieController> movieControllers;

    // To handle the concurrent request we can tell interviewer about Pessimistic and Optimistic locking strategy
    // Pessimistic Lock : Lock on whole object at the time of reading and release after updating it
    // Optimistic Lock : Lock on whole object at the time of update. Two threads can read the object at the same time
    // but the object will have a version V and after update the version will be updated and before updating the object
    // current version is compared with the initial version if both are same then only update.
    public BookMyShow() {
        initialize();
    }

    public void createBooking(Movie movie, Location location) {
        //create a booking for user
    }

    private void initialize() {
        initializeMovies();
        initializeTheatres();
    }

    private void initializeMovies(){
        //create movie and add to movieControllers;
    }

    private void initializeTheatres() {
        //create theatre and add to theatreControllers;
    }

}
