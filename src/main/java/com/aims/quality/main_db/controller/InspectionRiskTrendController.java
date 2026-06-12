package com.aims.quality.main_db.controller;
import com.aims.quality.main_db.dto.InspectionRiskTrendDto;
import com.aims.quality.main_db.entity.InspectionRiskTrend;
import com.aims.quality.main_db.repository.InspectionRiskTrendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quality/inspection")
@RequiredArgsConstructor
public class InspectionRiskTrendController {
    private final InspectionRiskTrendRepository
            inspectionRiskTrendRepository;

    @GetMapping("/risk-trend")
    public List<InspectionRiskTrendDto> getRiskTrendList() {

        List<InspectionRiskTrend> trendList =
                inspectionRiskTrendRepository.findAll();

        return trendList.stream()
                .map(InspectionRiskTrendDto::fromEntity)
                .toList();
    }

    @PostMapping("/risk-trend")
    public InspectionRiskTrendDto createRiskTrend(
            @RequestBody InspectionRiskTrendDto dto
    ) {

        InspectionRiskTrend saved =
                inspectionRiskTrendRepository.save(dto.toEntity());

        return InspectionRiskTrendDto.fromEntity(saved);
    }
}
