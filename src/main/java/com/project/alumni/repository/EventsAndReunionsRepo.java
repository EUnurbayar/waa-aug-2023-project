package com.project.alumni.repository;

import com.project.alumni.entity.EventsAndReunions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface EventsAndReunionsRepo extends ListCrudRepository<EventsAndReunions,Integer> {

}
