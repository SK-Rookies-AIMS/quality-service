package com.aims.quality.main_db.service;

import com.aims.quality.main_db.dto.InspectionSummaryDto;
import com.aims.quality.main_db.repository.InspectionSummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionSummaryService {

    private final InspectionSummaryRepository
            inspectionSummaryRepository;

    public List<InspectionSummaryDto> getInspectionSummaryList() {

        return inspectionSummaryRepository.findAll()
                .stream()
                .map(InspectionSummaryDto::fromEntity)
                .toList();
    }

    public InspectionSummaryDto createInspectionSummary(
            InspectionSummaryDto dto
    ) {

        return InspectionSummaryDto.fromEntity(
                inspectionSummaryRepository.save(dto.toEntity())
        );
    }

    public InspectionSummaryDto getLatestSummary() {

        return inspectionSummaryRepository.findById(1L)
                .map(InspectionSummaryDto::fromEntity)
                .orElse(null);
    }

    public void deleteInspectionSummary(Long id) {
        inspectionSummaryRepository.deleteById(id);
    }
}