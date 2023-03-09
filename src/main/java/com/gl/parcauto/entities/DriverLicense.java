package com.gl.parcauto.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "driver_license")
public class DriverLicense extends BaseEntity{
    public static final int expiryDate = 10;
    @Column(name = "delivery_date")
    private LocalDateTime deliveryDate;
    @Enumerated(EnumType.STRING)
    private DriverLicenseType licenseType;
}
