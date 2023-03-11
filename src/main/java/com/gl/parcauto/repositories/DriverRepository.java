package com.gl.parcauto.repositories;

import com.gl.parcauto.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DriverRepository extends JpaRepository<Driver, UUID> {
}