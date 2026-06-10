package com.aims.quality.main_db.dto;

import com.aims.quality.main_db.entity.InspectionProcess;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionProcessDto {
    private Long id;

    private String processName;

    private Integer totalVehicleCount;

    private Integer completedCount;

    private Integer waitingCount;

    private Double progressRate;

    private String processStatus;

    private LocalDateTime createdAt;

    public static InspectionProcessDto fromEntity(
            InspectionProcess entity
    ) {
        return InspectionProcessDto.builder()
                .id(entity.getId())
                .processName(entity.getProcessName())
                .totalVehicleCount(entity.getTotalVehicleCount())
                .completedCount(entity.getCompletedCount())
                .waitingCount(entity.getWaitingCount())
                .progressRate(entity.getProgressRate())
                .processStatus(entity.getProcessStatus())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public InspectionProcess toEntity() {
        return InspectionProcess.builder()
                .id(this.id)
                .processName(this.processName)
                .totalVehicleCount(this.totalVehicleCount)
                .completedCount(this.completedCount)
                .waitingCount(this.waitingCount)
                .progressRate(this.progressRate)
                .processStatus(this.processStatus)
                .createdAt(this.createdAt)
                .build();
    }
}
