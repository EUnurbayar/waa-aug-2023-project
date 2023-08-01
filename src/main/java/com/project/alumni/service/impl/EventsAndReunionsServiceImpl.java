package com.project.alumni.service.impl;

import com.project.alumni.entity.dto.EventsAndReunionsDto;
import com.project.alumni.repository.EventsAndReunionsRepo;
import com.project.alumni.service.EventsAndReunionsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class EventsAndReunionsServiceImpl implements EventsAndReunionsService {
    private EventsAndReunionsRepo eventsAndReunionsRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<EventsAndReunionsDto> getAll() {

        var entityList = eventsAndReunionsRepo.findAll();
        var result = new ArrayList<EventsAndReunionsDto>();
        entityList.forEach(entity -> {
            var dto = modelMapper.map(entity, EventsAndReunionsDto.class);
            result.add(dto);
        });

        return result;
    }

}
