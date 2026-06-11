package com.aims.quality.sample_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "car_drive")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDrive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicle_id")
    private String vehicleId;

    @Column(name = "throttle_position")
    private Double throttlePosition;

    @Column(name = "brake_pressure")
    private Double brakePressure;

    @Column(name = "steering_angle")
    private Double steeringAngle;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
