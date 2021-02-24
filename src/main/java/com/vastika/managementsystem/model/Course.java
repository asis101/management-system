package com.vastika.managementsystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "course_tbl")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_cost")
    private double courseCost;
    @Column(name = "course_period")
    private int coursePeriod;
    @ManyToOne(fetch = FetchType.EAGER)
    private College college;
}
