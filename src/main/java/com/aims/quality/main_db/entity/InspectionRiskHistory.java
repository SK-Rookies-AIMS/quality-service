package com.aims.quality.main_db.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inspection_risk_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionRiskHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "inspection_type")
    private String inspectionType;

    @Column(name = "risk_score")
    private Double riskScore;

    @Column(name = "record_time")
    private LocalDateTime recordTime;
}
