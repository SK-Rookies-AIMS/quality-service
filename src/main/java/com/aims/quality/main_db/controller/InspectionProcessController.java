package com.aims.quality.main_db.controller;

import com.aims.quality.main_db.dto.InspectionProcessDto;
import com.aims.quality.main_db.entity.InspectionProcess;
import com.aims.quality.main_db.repository.InspectionProcessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quality/inspection")
@RequiredArgsConstructor
public class InspectionProcessController {
    private final InspectionProcessRepository
            inspectionProcessRepository;

    @GetMapping("/process")
    public List<InspectionProcessDto> getProcessList() {

        List<InspectionProcess> processList =
                inspectionProcessRepository.findAll();

        return processList.stream()
                .map(InspectionProcessDto::fromEntity)
                .toList();
    }

    @PostMapping("/process")
    public InspectionProcessDto createProcess(
            @RequestBody InspectionProcessDto dto
    ) {

        InspectionProcess saved =
                inspectionProcessRepository.save(dto.toEntity());

        return InspectionProcessDto.fromEntity(saved);
    }
}
