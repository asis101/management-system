package com.vastika.managementsystem.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "studenet_tbl")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "student_name")
    private String studentName;
    private String email;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @Column(name = "contact_no")
    private long contactNo;
    @OneToOne(cascade = CascadeType.ALL)
    private Course course;

}
