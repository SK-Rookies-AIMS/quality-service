package com.aims.quality.main_db.dto;

import com.aims.quality.main_db.entity.InspectionSummary;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InspectionSummaryDto {
    private Long id;

    private Integer totalCount;

    private Integer normalCount;

    private Double normalRate;

    private Integer abnormalCount;

    private Double abnormalRate;

    private Integer standbyCount;

    private LocalDateTime createdAt;

    public static InspectionSummaryDto fromEntity(InspectionSummary entity) {
        return InspectionSummaryDto.builder()
                .id(entity.getId())
                .totalCount(entity.getTotalCount())
                .normalCount(entity.getNormalCount())
                .normalRate(entity.getNormalRate())
                .abnormalCount(entity.getAbnormalCount())
                .abnormalRate(entity.getAbnormalRate())
                .standbyCount(entity.getStanbyCount())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public InspectionSummary toEntity() {
        return InspectionSummary.builder()
                .id(this.id)
                .totalCount(this.totalCount)
                .normalCount(this.normalCount)
                .normalRate(this.normalRate)
                .abnormalCount(this.abnormalCount)
                .abnormalRate(this.abnormalRate)
                .stanbyCount(this.standbyCount)
                .createdAt(this.createdAt)
                .build();
    }
}
