package com.aims.quality.sample_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "car_master")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicle_id")
    private String vehicleId;

    @Column(name = "car_type")
    private String carType;

    @Column(name = "engine_type")
    private String engineType;

    @Column(name = "car_color")
    private String carColor;

    @Column(name = "fuel_efficiency")
    private Integer fuelEfficiency;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
