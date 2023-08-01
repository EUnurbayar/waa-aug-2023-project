package com.project.alumni.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Job_Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String company_name;
    private String position;
    private String description;
    private String benefits;

//    @OneToOne
//    private Address address;

    @ManyToOne
    private User user;
}
