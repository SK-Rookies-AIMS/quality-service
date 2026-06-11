package com.aims.quality.sample_db.dto;

import com.aims.quality.sample_db.entity.CarDrive;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDriveDto {
    private Long id;

    private String vehicleId;

    private Double throttlePosition;

    private Double brakePressure;

    private Double steeringAngle;

    private LocalDateTime createdAt;

    public static CarDriveDto fromEntity(
            CarDrive entity
    ) {
        return CarDriveDto.builder()
                .id(entity.getId())
                .vehicleId(entity.getVehicleId())
                .throttlePosition(entity.getThrottlePosition())
                .brakePressure(entity.getBrakePressure())
                .steeringAngle(entity.getSteeringAngle())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public CarDrive toEntity() {
        return CarDrive.builder()
                .id(this.id)
                .vehicleId(this.vehicleId)
                .throttlePosition(this.throttlePosition)
                .brakePressure(this.brakePressure)
                .steeringAngle(this.steeringAngle)
                .createdAt(this.createdAt)
                .build();
    }
}
