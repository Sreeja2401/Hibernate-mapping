package com.example.hibernatemapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@Slf4j
public class HibernateMappingApplication implements CommandLineRunner {


    @Autowired
    EmployeeRepo employeeRepo;
    public static void main(String[] args) {
        SpringApplication.run(HibernateMappingApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
//        Employee e1=new Employee();
//        e1.setName("sreeja");
//        e1.setRole("jr_dev");
//
//        Laptop l1=new Laptop();
//        l1.setType("windows");
//        e1.setLaptop(l1);
//        l1.setEmployee(e1);
//        employeeRepo.save(e1);

        Employee e2=new Employee();
        e2.setName("sreeja");
        e2.setRole("jr_dev");

        Laptop l2=new Laptop();
        l2.setType("mac");

        Address a =new Address();
        a.setHno("nirmal");
        a.setStreetNo(3);

        Address a1 =new Address();
        a1.setHno("hyd");
        a1.setStreetNo(3);

        Skills s1 =new Skills();
        s1.setName("java");


        Skills s2=new Skills();
        s2.setName("spring");


        e2.setAddress(List.of(a,a1));
        e2.setLaptop(l2);
        e2.setSkillsList(List.of(s1,s2));

        l2.setEmployee(e2);

        a.setEmployee(e2);
        a1.setEmployee(e2);

        s1.setEmployeeList(List.of(e2));
        s2.setEmployeeList(List.of(e2));

        employeeRepo.save(e2);


//         Optional<Employee> employee= employeeRepo.findById(1);
//         System.out.println(employee);

    }
}
