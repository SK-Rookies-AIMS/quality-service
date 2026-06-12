package com.aims.quality.main_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inspection_status_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionStatusDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_code")
    private String carCode;

    @Column(name = "inspection_no")
    private String inspectionNo;

    @Column(name = "vehicle_id")
    private String vehicleId;

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

    @Column(name = "status_score")
    private Double statusScore;

    @Column(name = "inspection_result")
    private String inspectionResult;

    @Column(name = "issue_message")
    private String issueMessage;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
