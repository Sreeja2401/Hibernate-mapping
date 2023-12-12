package com.example.hibernatemapping;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


    @ManyToMany
    @JoinTable(
            name="employee_skills",
            joinColumns = @JoinColumn(name = "skills_id"),
            inverseJoinColumns = @JoinColumn(name="employee_id")
    )
    private List<Employee> employeeList;
}
