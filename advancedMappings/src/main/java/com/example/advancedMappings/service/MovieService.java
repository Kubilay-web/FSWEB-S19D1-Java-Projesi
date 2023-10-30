package com.example.advancedMappings.service;
import com.example.advancedMappings.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie getMovieById(Long id);
    Movie saveMovie(Movie movie);
    void deleteMovie(Long id);
}
