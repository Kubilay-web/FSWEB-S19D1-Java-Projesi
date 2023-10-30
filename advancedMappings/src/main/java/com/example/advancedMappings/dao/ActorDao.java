package com.example.advancedMappings.dao;

import com.example.advancedMappings.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorDao extends JpaRepository<Actor, Long> {

}