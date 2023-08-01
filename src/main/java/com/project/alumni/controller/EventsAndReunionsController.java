package com.project.alumni.controller;

import com.project.alumni.entity.dto.EventsAndReunionsDto;
import com.project.alumni.service.EventsAndReunionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventsAndReunionsController {
    @Autowired
    private EventsAndReunionsService eventReunionsService;


    @GetMapping
    public List<EventsAndReunionsDto> getAll(){
        return eventReunionsService.getAll();
    }

}
