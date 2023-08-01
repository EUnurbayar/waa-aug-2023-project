package com.project.alumni.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Attendance {
    @Id
    private int id;
    @OneToOne
    private EventsAndReunions eventsAndReunions;
    @OneToMany
    private List<User> users;

    public void add(User user){
        users.add(user);
    }

}
