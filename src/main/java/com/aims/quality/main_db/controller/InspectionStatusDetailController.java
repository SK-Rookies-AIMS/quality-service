package com.aims.quality.main_db.controller;

import com.aims.quality.main_db.dto.InspectionStatusDetailDto;
import com.aims.quality.main_db.entity.InspectionStatusDetail;
import com.aims.quality.main_db.repository.InspectionStatusDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inspection")
@RequiredArgsConstructor
public class InspectionStatusDetailController {
    private final InspectionStatusDetailRepository
            inspectionStatusDetailRepository;

    @GetMapping("/status-detail")
    public List<InspectionStatusDetailDto> getStatusDetailList() {

        List<InspectionStatusDetail> detailList =
                inspectionStatusDetailRepository.findAll();

        return detailList.stream()
                .map(InspectionStatusDetailDto::fromEntity)
                .toList();
    }

    @PostMapping("/status-detail")
    public InspectionStatusDetailDto createStatusDetail(
            @RequestBody InspectionStatusDetailDto dto
    ) {

        InspectionStatusDetail saved =
                inspectionStatusDetailRepository.save(dto.toEntity());

        return InspectionStatusDetailDto.fromEntity(saved);
    }
}
