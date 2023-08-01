package com.project.alumni.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Job_Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String companyName;
    private String job_name;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    private User user;

}
