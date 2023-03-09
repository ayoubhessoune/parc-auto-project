package com.gl.parcauto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "driver_license")
public class DriverLicense extends BaseEntity{
    public static final int expiryDate = 10;
    @Column(name = "delivery_date")
    private LocalDateTime deliveryDate;
    @Enumerated(EnumType.STRING)
    private DriverLicenseType licenseType;
}
