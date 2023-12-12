package com.example.hibernatemapping;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "jpa_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employee_name")
    private String name;

    @Column(name="designation")
    private String role;

    @OneToOne(mappedBy = "employee")
    private Laptop laptop;

    @OneToMany(mappedBy = "employee")
    private List<Address> address=new ArrayList<>();

    @ManyToMany(mappedBy = "employeeList",cascade = CascadeType.ALL)
    private List<Skills> skillsList;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
//                ", laptop=" + laptop +
//                ", address=" + address +
//                ", skillsList=" + skillsList +
                '}';
    }
}
