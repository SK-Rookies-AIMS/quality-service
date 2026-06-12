package com.aims.quality.sample_db.dto;

import com.aims.quality.sample_db.entity.CarDynamics;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDynamicsDto {
    private Long id;

    private String vehicleId;

    private Double throttlePosition;

    private Double brakePressure;

    private Double steeringAngle;

    private Double accelX;

    private Double accelY;

    private Double yawRate;

    private Double roll;

    private Double pitch;

    private LocalDateTime createdAt;

    public static CarDynamicsDto fromEntity(
            CarDynamics entity
    ) {
        return CarDynamicsDto.builder()
                .id(entity.getId())
                .vehicleId(entity.getVehicleId())
                .throttlePosition(entity.getThrottlePosition())
                .brakePressure(entity.getBrakePressure())
                .steeringAngle(entity.getSteeringAngle())
                .accelX(entity.getAccelX())
                .accelY(entity.getAccelY())
                .yawRate(entity.getYawRate())
                .roll(entity.getRoll())
                .pitch(entity.getPitch())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public CarDynamics toEntity() {
        return CarDynamics.builder()
                .id(this.id)
                .vehicleId(this.vehicleId)
                .throttlePosition(this.throttlePosition)
                .brakePressure(this.brakePressure)
                .steeringAngle(this.steeringAngle)
                .accelX(this.accelX)
                .accelY(this.accelY)
                .yawRate(this.yawRate)
                .roll(this.roll)
                .pitch(this.pitch)
                .createdAt(this.createdAt)
                .build();
    }
}
