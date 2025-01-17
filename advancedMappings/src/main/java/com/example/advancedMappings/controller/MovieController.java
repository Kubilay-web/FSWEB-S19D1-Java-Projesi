package com.example.advancedMappings.controller;
import com.example.advancedMappings.entity.Movie;
import com.example.advancedMappings.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @PostMapping
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie newMovieData) {
        Movie existingMovie = movieService.getMovieById(id);
        if (existingMovie != null) {
            existingMovie.setName(newMovieData.getName());
            existingMovie.setDirectorName(newMovieData.getDirectorName());
            existingMovie.setRating(newMovieData.getRating());
            existingMovie.setReleaseDate(newMovieData.getReleaseDate());
            return movieService.saveMovie(existingMovie);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }
}
