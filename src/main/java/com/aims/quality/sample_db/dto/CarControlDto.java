package com.aims.quality.sample_db.dto;

import com.aims.quality.sample_db.entity.CarControl;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarControlDto {
    private Long id;

    private String vehicleId;

    private Integer absActive;

    private Integer tractionControl;

    private Integer laneDeparture;

    private Integer collisionWarning;

    private LocalDateTime createdAt;

    public static CarControlDto fromEntity(
            CarControl entity
    ) {
        return CarControlDto.builder()
                .id(entity.getId())
                .vehicleId(entity.getVehicleId())
                .absActive(entity.getAbsActive())
                .tractionControl(entity.getTractionControl())
                .laneDeparture(entity.getLaneDeparture())
                .collisionWarning(entity.getCollisionWarning())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public CarControl toEntity() {
        return CarControl.builder()
                .id(this.id)
                .vehicleId(this.vehicleId)
                .absActive(this.absActive)
                .tractionControl(this.tractionControl)
                .laneDeparture(this.laneDeparture)
                .collisionWarning(this.collisionWarning)
                .createdAt(this.createdAt)
                .build();
    }
}
