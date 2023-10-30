package com.example.advancedMappings.repository;

import com.example.advancedMappings.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
