package com.vastika.managementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "college_tbl")
@Data
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "college_name")
    private String collegeName;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    private String email;
    @Column(name = "contact_no")
    private long contactNo;
    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<Course> courses;

}
