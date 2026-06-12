package com.aims.quality.main_db.dto;

import com.aims.quality.main_db.entity.InspectionRiskTrend;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionRiskTrendDto {
    private Long id;

    private String riskLevel;

    private Integer riskCount;

    private Double riskRatio;

    private LocalDateTime createdAt;

    public static InspectionRiskTrendDto fromEntity(
            InspectionRiskTrend entity
    ) {
        return InspectionRiskTrendDto.builder()
                .id(entity.getId())
                .riskLevel(entity.getRiskLevel())
                .riskCount(entity.getRiskCount())
                .riskRatio(entity.getRiskRatio())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public InspectionRiskTrend toEntity() {
        return InspectionRiskTrend.builder()
                .id(this.id)
                .riskLevel(this.riskLevel)
                .riskCount(this.riskCount)
                .riskRatio(this.riskRatio)
                .createdAt(this.createdAt)
                .build();
    }
}
