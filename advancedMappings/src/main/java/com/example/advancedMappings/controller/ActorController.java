package com.example.advancedMappings.controller;

import com.example.advancedMappings.entity.Actor;
import com.example.advancedMappings.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {
    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable Long id) {
        return actorService.getActorById(id);
    }

    @PostMapping
    public Actor saveActor(@RequestBody Actor actor) {
        return actorService.saveActor(actor);
    }


    @PutMapping("/{id}")
    public Actor updateActor(@PathVariable Long id, @RequestBody Actor newActorData) {
        Actor existingActor = actorService.getActorById(id);
        if (existingActor != null) {
            existingActor.setFirstName(newActorData.getFirstName());
            existingActor.setLastName(newActorData.getLastName());
            existingActor.setGender(newActorData.getGender());
            existingActor.setBirthDate(newActorData.getBirthDate());
            return actorService.saveActor(existingActor);
        } else {
            return null;
        }
    }


    @DeleteMapping("/{id}")
    public void deleteActor(@PathVariable Long id) {
        actorService.deleteActor(id);
    }
}
