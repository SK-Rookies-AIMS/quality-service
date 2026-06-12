package com.aims.quality.main_db.dto;

import com.aims.quality.main_db.entity.InspectionStatusDetail;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionStatusDetailDto {
    private Long id;

    private String carCode;

    private String inspectionNo;

    private String vehicleId;

    private Double speed;

    private Integer att;

    private String gear;

    private Double batteryVoltage;

    private Double fuelRate;

    private Double statusScore;

    private String inspectionResult;

    private String issueMessage;

    private LocalDateTime createdAt;

    public static InspectionStatusDetailDto fromEntity(
            InspectionStatusDetail entity
    ) {
        return InspectionStatusDetailDto.builder()
                .id(entity.getId())
                .carCode(entity.getCarCode())
                .inspectionNo(entity.getInspectionNo())
                .vehicleId(entity.getVehicleId())
                .speed(entity.getSpeed())
                .att(entity.getAtt())
                .gear(entity.getGear())
                .batteryVoltage(entity.getBatteryVoltage())
                .fuelRate(entity.getFuelRate())
                .statusScore(entity.getStatusScore())
                .inspectionResult(entity.getInspectionResult())
                .issueMessage(entity.getIssueMessage())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public InspectionStatusDetail toEntity() {
        return InspectionStatusDetail.builder()
                .id(this.id)
                .carCode(this.carCode)
                .inspectionNo(this.inspectionNo)
                .vehicleId(this.vehicleId)
                .speed(this.speed)
                .att(this.att)
                .gear(this.gear)
                .batteryVoltage(this.batteryVoltage)
                .fuelRate(this.fuelRate)
                .statusScore(this.statusScore)
                .inspectionResult(this.inspectionResult)
                .issueMessage(this.issueMessage)
                .createdAt(this.createdAt)
                .build();
    }
}
