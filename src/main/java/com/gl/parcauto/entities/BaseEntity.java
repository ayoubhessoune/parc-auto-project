package com.gl.parcauto.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Timestamp;
import java.util.UUID;


@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @UuidGenerator
    @Column(name = "id", columnDefinition = "varchar", nullable = false, updatable = false)
    private UUID uuid;
    @CreationTimestamp
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;
}
