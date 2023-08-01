package com.project.alumni.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User_details> user_details;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    private List<Role> roles;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Job_Advertisement> job_ad;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<EventsAndReunions> ev_reunions;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<InsightsAndSurveys> ins_surveys;
}
