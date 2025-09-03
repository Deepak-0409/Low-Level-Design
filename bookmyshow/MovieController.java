package com.practice.java.lld.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<String, List<Movie>>cityVsMovie = new HashMap<>();
    List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie, String city) {
        movieList.add(movie);
        if(cityVsMovie.containsKey(city)) {
            cityVsMovie.get(city).add(movie);
        } else {
            cityVsMovie.put(city,List.of(movie));
        }
    }

    public List<Movie> getMoviesByCity(String city) {
        return cityVsMovie.get(city);
    }

}
