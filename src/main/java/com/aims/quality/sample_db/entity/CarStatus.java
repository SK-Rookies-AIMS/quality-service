package com.aims.quality.sample_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "car_status")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicle_id")
    private String vehicleId;

    @Column(name = "car_type")
    private String carType;

    @Column(name = "speed")
    private Double speed;

    @Column(name = "att")
    private Integer att;

    @Column(name = "gear")
    private String gear;

    @Column(name = "battery_voltage")
    private Double batteryVoltage;

    @Column(name = "fuel_rate")
    private Double fuelRate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
