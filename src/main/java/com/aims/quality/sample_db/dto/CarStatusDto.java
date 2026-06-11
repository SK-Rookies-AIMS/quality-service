package com.aims.quality.sample_db.dto;

import com.aims.quality.sample_db.entity.CarStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarStatusDto {
    private Long id;

    private String vehicleId;

    private String carType;

    private Double speed;

    private Integer att;

    private String gear;

    private Double batteryVoltage;

    private Double fuelRate;

    private LocalDateTime createdAt;

    public static CarStatusDto fromEntity(
            CarStatus entity
    ) {
        return CarStatusDto.builder()
                .id(entity.getId())
                .vehicleId(entity.getVehicleId())
                .carType(entity.getCarType())
                .speed(entity.getSpeed())
                .att(entity.getAtt())
                .gear(entity.getGear())
                .batteryVoltage(entity.getBatteryVoltage())
                .fuelRate(entity.getFuelRate())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public CarStatus toEntity() {
        return CarStatus.builder()
                .id(this.id)
                .vehicleId(this.vehicleId)
                .carType(this.carType)
                .speed(this.speed)
                .att(this.att)
                .gear(this.gear)
                .batteryVoltage(this.batteryVoltage)
                .fuelRate(this.fuelRate)
                .createdAt(this.createdAt)
                .build();
    }
}
