package com.aims.quality.main_db.dto;

import com.aims.quality.main_db.entity.InspectionDriveDetail;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionDriveDetailDto {
    private Long id;

    private String carCode;

    private String inspectionNo;

    private String vehicleId;

    private Double throttlePosition;

    private Double brakePressure;

    private Double steeringAngle;

    private Double driveScore;

    private String inspectionResult;

    private String drivingPattern;

    private String issueMessage;

    private LocalDateTime createdAt;

    public static InspectionDriveDetailDto fromEntity(
            InspectionDriveDetail entity
    ) {
        return InspectionDriveDetailDto.builder()
                .id(entity.getId())
                .carCode(entity.getCarCode())
                .inspectionNo(entity.getInspectionNo())
                .vehicleId(entity.getVehicleId())
                .throttlePosition(entity.getThrottlePosition())
                .brakePressure(entity.getBrakePressure())
                .steeringAngle(entity.getSteeringAngle())
                .driveScore(entity.getDriveScore())
                .inspectionResult(entity.getInspectionResult())
                .drivingPattern(entity.getDrivingPattern())
                .issueMessage(entity.getIssueMessage())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public InspectionDriveDetail toEntity() {
        return InspectionDriveDetail.builder()
                .id(this.id)
                .carCode(this.carCode)
                .inspectionNo(this.inspectionNo)
                .vehicleId(this.vehicleId)
                .throttlePosition(this.throttlePosition)
                .brakePressure(this.brakePressure)
                .steeringAngle(this.steeringAngle)
                .driveScore(this.driveScore)
                .inspectionResult(this.inspectionResult)
                .drivingPattern(this.drivingPattern)
                .issueMessage(this.issueMessage)
                .createdAt(this.createdAt)
                .build();
    }
}
