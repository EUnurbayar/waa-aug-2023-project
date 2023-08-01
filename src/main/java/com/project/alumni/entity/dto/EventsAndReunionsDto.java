package com.project.alumni.entity.dto;

import com.project.alumni.entity.User;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventsAndReunionsDto {
    private int id;

    private String name;
    private int type;
    private User user;
}
