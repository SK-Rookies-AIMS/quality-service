package com.aims.quality.sample_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "car_dynamics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDynamics {
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

    @Column(name = "accel_x")
    private Double accelX;

    @Column(name = "accel_y")
    private Double accelY;

    @Column(name = "yaw_rate")
    private Double yawRate;

    @Column(name = "roll")
    private Double roll;

    @Column(name = "pitch")
    private Double pitch;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
