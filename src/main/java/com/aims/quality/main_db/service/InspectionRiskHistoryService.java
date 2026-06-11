package com.aims.quality.main_db.service;

import com.aims.quality.main_db.dto.InspectionRiskHistoryDto;
import com.aims.quality.main_db.repository.InspectionRiskHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionRiskHistoryService {

    private final InspectionRiskHistoryRepository
            inspectionRiskHistoryRepository;

    public List<InspectionRiskHistoryDto> getRiskHistoryList() {

        return inspectionRiskHistoryRepository.findAll()
                .stream()
                .map(InspectionRiskHistoryDto::fromEntity)
                .toList();
    }

    public InspectionRiskHistoryDto createRiskHistory(
            InspectionRiskHistoryDto dto
    ) {

        return InspectionRiskHistoryDto.fromEntity(
                inspectionRiskHistoryRepository.save(dto.toEntity())
        );
    }

    public void deleteRiskHistory(Long id) {
        inspectionRiskHistoryRepository.deleteById(id);
    }
}