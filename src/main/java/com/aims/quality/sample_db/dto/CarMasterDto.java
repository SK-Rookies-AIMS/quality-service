package com.aims.quality.sample_db.dto;

import com.aims.quality.sample_db.entity.CarMaster;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarMasterDto {
    private Long id;

    private String vehicleId;

    private String carType;

    private String engineType;

    private String carColor;

    private Integer fuelEfficiency;

    private LocalDateTime createdAt;

    public static CarMasterDto fromEntity(
            CarMaster entity
    ) {
        return CarMasterDto.builder()
                .id(entity.getId())
                .vehicleId(entity.getVehicleId())
                .carType(entity.getCarType())
                .engineType(entity.getEngineType())
                .carColor(entity.getCarColor())
                .fuelEfficiency(entity.getFuelEfficiency())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public CarMaster toEntity() {
        return CarMaster.builder()
                .id(this.id)
                .vehicleId(this.vehicleId)
                .carType(this.carType)
                .engineType(this.engineType)
                .carColor(this.carColor)
                .fuelEfficiency(this.fuelEfficiency)
                .createdAt(this.createdAt)
                .build();
    }
}
