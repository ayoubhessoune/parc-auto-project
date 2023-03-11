package com.gl.parcauto.repositories;

import com.gl.parcauto.entities.DriverLicense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DriverLicenseRepository extends JpaRepository<DriverLicense, UUID> {
}