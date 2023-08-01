package com.project.alumni.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user_details")
public class User_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    // contact information
    private String last_name;
    private String first_name;
    private String email;
    private Long phone_num;

    // university information
    private String university_name;
    private String degree;
    private String start_date;
    private String end_date;

    // achievement information
    private String achieve_title;
    private String issue_date;
    private String portfolio;
}
