package com.aims.quality.main_db.controller;

import com.aims.quality.main_db.dto.InspectionRiskHistoryDto;
import com.aims.quality.main_db.entity.InspectionRiskHistory;
import com.aims.quality.main_db.repository.InspectionRiskHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quality/inspection")
@RequiredArgsConstructor
public class InspectionRiskHistoryController {
    private final InspectionRiskHistoryRepository
            inspectionRiskHistoryRepository;

    @GetMapping("/risk-history")
    public List<InspectionRiskHistoryDto> getRiskHistoryList() {

        List<InspectionRiskHistory> historyList =
                inspectionRiskHistoryRepository.findAll();

        return historyList.stream()
                .map(InspectionRiskHistoryDto::fromEntity)
                .toList();
    }

    @PostMapping("/risk-history")
    public InspectionRiskHistoryDto createRiskHistory(
            @RequestBody InspectionRiskHistoryDto dto
    ) {

        InspectionRiskHistory saved =
                inspectionRiskHistoryRepository.save(dto.toEntity());

        return InspectionRiskHistoryDto.fromEntity(saved);
    }
}
