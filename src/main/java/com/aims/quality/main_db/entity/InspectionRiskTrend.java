package com.aims.quality.main_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inspection_risk_trend")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionRiskTrend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "risk_level")
    private String riskLevel;

    @Column(name = "risk_count")
    private Integer riskCount;

    @Column(name = "risk_ratio")
    private Double riskRatio;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
