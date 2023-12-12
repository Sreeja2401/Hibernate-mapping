package com.example.hibernatemapping;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "jpa_laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "laptop_type")
    private String type;
    @OneToOne
    private Employee employee;
}
