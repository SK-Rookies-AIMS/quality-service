package com.aims.quality.main_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inspection_summary")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class InspectionSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_count")
    private Integer totalCount;

    @Column(name = "normal_count")
    private Integer normalCount;

    @Column(name = "normal_rate")
    private Double normalRate;

    @Column(name = "abnormal_count")
    private Integer abnormalCount;

    @Column(name = "abnormal_rate")
    private Double abnormalRate;

    @Column(name = "stanby_count")
    private Integer stanbyCount;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
