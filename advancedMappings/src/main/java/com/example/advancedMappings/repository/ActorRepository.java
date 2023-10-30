package com.example.advancedMappings.repository;

import com.example.advancedMappings.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Long> {
}
