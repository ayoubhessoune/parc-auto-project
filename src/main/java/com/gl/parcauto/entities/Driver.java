package com.gl.parcauto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @OneToMany(mappedBy = "driver", fetch = FetchType.LAZY)
    private Set<Assigned> assignedSet = new HashSet<>();
}
