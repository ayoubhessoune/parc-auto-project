package com.gl.parcauto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "assigned")
public class Assigned {
    @Id
    @UuidGenerator
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(name = "id", columnDefinition = "varchar(36)", nullable = false, updatable = false)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @Column(name = "assignDate")
    private LocalDateTime assignDate;
}
