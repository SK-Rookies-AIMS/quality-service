package com.aims.quality.main_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inspection_drive_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionDriveDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_code")
    private String carCode;

    @Column(name = "inspection_no")
    private String inspectionNo;

    @Column(name = "vehicle_id")
    private String vehicleId;

    @Column(name = "throttle_position")
    private Double throttlePosition;

    @Column(name = "brake_pressure")
    private Double brakePressure;

    @Column(name = "steering_angle")
    private Double steeringAngle;

    @Column(name = "drive_score")
    private Double driveScore;

    @Column(name = "inspection_result")
    private String inspectionResult;

    @Column(name = "driving_pattern")
    private String drivingPattern;

    @Column(name = "issue_message")
    private String issueMessage;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
