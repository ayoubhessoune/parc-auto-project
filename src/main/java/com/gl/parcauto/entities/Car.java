package com.gl.parcauto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "car")
public class Car extends BaseEntity{
    @Column(name = "license_plate")
    private String licensePlate;
    @OneToMany(mappedBy = "car")
    private Set<Assigned> assignedSet = new HashSet<>();
}
