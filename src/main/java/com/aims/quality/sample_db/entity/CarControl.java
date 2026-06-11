package com.aims.quality.sample_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "car_control")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicle_id")
    private String vehicleId;

    @Column(name = "abs_active")
    private Integer absActive;

    @Column(name = "traction_control")
    private Integer tractionControl;

    @Column(name = "lane_departure")
    private Integer laneDeparture;

    @Column(name = "collision_warning")
    private Integer collisionWarning;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
