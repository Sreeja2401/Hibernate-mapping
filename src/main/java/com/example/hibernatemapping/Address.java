package com.example.hibernatemapping;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int streetNo;
    private String hno;

    @ManyToOne
    private Employee employee;


}
