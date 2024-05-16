package com.anubhav.emsbackend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Primary;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(nullable = false,unique = true)
    private String email;
}
