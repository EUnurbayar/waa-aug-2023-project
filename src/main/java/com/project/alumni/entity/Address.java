package com.project.alumni.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String state;
    private String city;
    private String street;
    private Long zipcode;

//    @OneToOne
//    @JoinColumn(name = "jobAdd_id")
//    private Job_Advertisement jobAdvertisement;

}
