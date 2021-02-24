package com.vastika.managementsystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address_tbl")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String city;
    private String state;
    private String country;
}
