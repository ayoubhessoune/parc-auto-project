package com.gl.parcauto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "car")
public class Car extends BaseEntity{
    @Column(name = "license_plate")
    private String licensePlate;
    @OneToMany(mappedBy = "car")
    private Set<Assigned> assignedSet = new HashSet<>();
}
