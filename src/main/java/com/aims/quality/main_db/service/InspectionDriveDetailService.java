package com.aims.quality.main_db.service;

import com.aims.quality.main_db.dto.InspectionDriveDetailDto;
import com.aims.quality.main_db.repository.InspectionDriveDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionDriveDetailService {

    private final InspectionDriveDetailRepository
            inspectionDriveDetailRepository;

    public List<InspectionDriveDetailDto> getDriveDetailList() {

        return inspectionDriveDetailRepository
                .findAllByOrderByIdDesc()
                .stream()
                .map(InspectionDriveDetailDto::fromEntity)
                .toList();
    }

    public InspectionDriveDetailDto createDriveDetail(
            InspectionDriveDetailDto dto
    ) {

        return InspectionDriveDetailDto.fromEntity(
                inspectionDriveDetailRepository.save(dto.toEntity())
        );
    }

    public void deleteDriveDetail(Long id) {
        inspectionDriveDetailRepository.deleteById(id);
    }
}