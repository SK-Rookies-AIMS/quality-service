package com.aims.quality.main_db.controller;

import com.aims.quality.main_db.dto.InspectionDriveDetailDto;
import com.aims.quality.main_db.entity.InspectionDriveDetail;
import com.aims.quality.main_db.repository.InspectionDriveDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quality/inspection")
@RequiredArgsConstructor
public class InspectionDriveDetailController {
    private final InspectionDriveDetailRepository
            inspectionDriveDetailRepository;

    @GetMapping("/drive-detail") 
    public List<InspectionDriveDetailDto> getDriveDetailList() {

        List<InspectionDriveDetail> detailList =
                inspectionDriveDetailRepository.findAll();

        return detailList.stream()
                .map(InspectionDriveDetailDto::fromEntity)
                .toList();
    }

    @PostMapping("/drive-detail")
    public InspectionDriveDetailDto createDriveDetail(
            @RequestBody InspectionDriveDetailDto dto
    ) {

        InspectionDriveDetail saved =
                inspectionDriveDetailRepository.save(dto.toEntity());

        return InspectionDriveDetailDto.fromEntity(saved);
    }
}
