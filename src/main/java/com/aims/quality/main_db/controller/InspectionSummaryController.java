package com.aims.quality.main_db.controller;

import com.aims.quality.main_db.dto.InspectionSummaryDto;
import com.aims.quality.main_db.entity.InspectionSummary;
import com.aims.quality.main_db.repository.InspectionSummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quality/inspection")
@RequiredArgsConstructor
public class InspectionSummaryController {
    private final InspectionSummaryRepository inspectionSummaryRepository;

    @GetMapping("/summary")
    public List<InspectionSummaryDto> getInspectionSummaryList() {

        List<InspectionSummary> summaryList =
                inspectionSummaryRepository.findAll();

        return summaryList.stream()
                .map(InspectionSummaryDto::fromEntity)
                .toList();
    }

    @PostMapping("/summary")
    public InspectionSummaryDto createInspectionSummary(
            @RequestBody InspectionSummaryDto dto
    ) {

        InspectionSummary saved =
                inspectionSummaryRepository.save(dto.toEntity());

        return InspectionSummaryDto.fromEntity(saved);
    }
}
