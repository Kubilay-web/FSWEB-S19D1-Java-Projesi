package com.example.advancedMappings.service;


import com.example.advancedMappings.entity.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> getAllActors();
    Actor getActorById(Long id);
    Actor saveActor(Actor actor);
    void deleteActor(Long id);
}

