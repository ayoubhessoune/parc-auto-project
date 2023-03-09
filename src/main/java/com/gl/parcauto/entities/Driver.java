package com.gl.parcauto.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.*;

@Data
@Entity
@Table(name = "driver")
public class Driver extends BaseEntity{
    @Column(name = "cin")
    private String cin;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;

    @OneToMany(mappedBy = "driver")
    private Set<Assigned> assignedSet = new HashSet<>();
}
