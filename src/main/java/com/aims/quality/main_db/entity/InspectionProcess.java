package com.aims.quality.main_db.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inspection_process")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "process_name")
    private String processName;

    @Column(name = "total_vehicle_count")
    private Integer totalVehicleCount;

    @Column(name = "completed_count")
    private Integer completedCount;

    @Column(name = "waiting_count")
    private Integer waitingCount;

    @Column(name = "progress_rate")
    private Double progressRate;

    @Column(name = "process_status")
    private String processStatus;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
