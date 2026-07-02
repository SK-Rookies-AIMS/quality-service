package com.aims.quality.main_db.service;

import com.aims.quality.main_db.dto.InspectionProcessDto;
import com.aims.quality.main_db.repository.InspectionProcessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionProcessService {

    private final InspectionProcessRepository
            inspectionProcessRepository;

    public List<InspectionProcessDto> getProcessList() {

        return inspectionProcessRepository
                .findAllByOrderByIdAsc()
                .stream()
                .map(InspectionProcessDto::fromEntity)
                .toList();
    }

    public InspectionProcessDto createProcess(
            InspectionProcessDto dto
    ) {

        return InspectionProcessDto.fromEntity(
                inspectionProcessRepository.save(dto.toEntity())
        );
    }

    public void deleteProcess(Long id) {
        inspectionProcessRepository.deleteById(id);
    }
}