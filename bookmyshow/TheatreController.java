package com.practice.java.lld.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TheatreController {
    //Store all the theatres in a city
    Map<String, List<Theatre>> cityVsTheatre = new HashMap<>();
    List<Theatre> theatreList = new ArrayList<>();

    //add Theatre
    public void addTheatre(String city, Theatre theatre) {
        theatreList.add(theatre);
        if(cityVsTheatre.containsKey(city)) {
            cityVsTheatre.get(city).add(theatre);
        } else {
            cityVsTheatre.put(city, List.of(theatre));
        }
    }

    //get all shows
    public List<Show> getAllShows(String city, Movie movie) {
        List<Theatre> theatreAvailable = cityVsTheatre.get(city);
        List<Show> shows = new ArrayList<>();

        for(Theatre theatre: theatreAvailable) {
            shows.addAll(theatre.getShowList().stream().filter(show -> movie.getId()==show.movie.getId()).toList());
        }

        return shows;
    }
}
