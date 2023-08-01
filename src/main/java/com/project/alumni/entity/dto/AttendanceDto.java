package com.project.alumni.entity.dto;

import com.project.alumni.entity.EventsAndReunions;
import com.project.alumni.entity.User;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class AttendanceDto {
    private int id;
    private EventsAndReunions eventsAndReunions;
    private List<User> users;
}
