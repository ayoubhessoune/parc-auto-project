package com.gl.parcauto.repositories;

import com.gl.parcauto.entities.Assigned;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssignedRepository extends JpaRepository<Assigned, UUID> {

}