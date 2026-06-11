package com.aims.quality.main_db.service;

import com.aims.quality.main_db.dto.InspectionRiskTrendDto;
import com.aims.quality.main_db.repository.InspectionRiskTrendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionRiskTrendService {

    private final InspectionRiskTrendRepository
            inspectionRiskTrendRepository;

    public List<InspectionRiskTrendDto> getRiskTrendList() {

        return inspectionRiskTrendRepository.findAll()
                .stream()
                .map(InspectionRiskTrendDto::fromEntity)
                .toList();
    }

    public InspectionRiskTrendDto createRiskTrend(
            InspectionRiskTrendDto dto
    ) {

        return InspectionRiskTrendDto.fromEntity(
                inspectionRiskTrendRepository.save(dto.toEntity())
        );
    }

    public void deleteRiskTrend(Long id) {
        inspectionRiskTrendRepository.deleteById(id);
    }
}