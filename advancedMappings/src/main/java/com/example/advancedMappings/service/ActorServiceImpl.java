package com.example.advancedMappings.service;

import com.example.advancedMappings.entity.Actor;
import com.example.advancedMappings.repository.ActorRepository;
import com.example.advancedMappings.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;

    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    @Override
    public Actor getActorById(Long id) {
        return actorRepository.findById(id).orElse(null);
    }

    @Override
    public Actor saveActor(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public void deleteActor(Long id) {
        actorRepository.deleteById(id);
    }
}