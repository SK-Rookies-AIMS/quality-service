package com.aims.quality.main_db.dto;
import com.aims.quality.main_db.entity.InspectionRiskHistory;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionRiskHistoryDto {
    private Long id;

    private String inspectionType;

    private Double riskScore;

    private String recordTime;

    public static InspectionRiskHistoryDto fromEntity(
            InspectionRiskHistory entity
    ) {
        return InspectionRiskHistoryDto.builder()
                .id(entity.getId())
                .inspectionType(entity.getInspectionType())
                .riskScore(entity.getRiskScore())
                .recordTime(entity.getRecordTime())
                .build();
    }

    public InspectionRiskHistory toEntity() {
        return InspectionRiskHistory.builder()
                .id(this.id)
                .inspectionType(this.inspectionType)
                .riskScore(this.riskScore)
                .recordTime(this.recordTime)
                .build();
    }
}
