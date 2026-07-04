package com.aims.quality.main_db.service;

import com.aims.quality.main_db.dto.InspectionStatusDetailDto;
import com.aims.quality.main_db.repository.InspectionStatusDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionStatusDetailService {

    private final InspectionStatusDetailRepository
            inspectionStatusDetailRepository;

    public List<InspectionStatusDetailDto> getStatusDetailList() {

        return inspectionStatusDetailRepository
                .findAllByOrderByIdDesc()
                .stream()
                .map(InspectionStatusDetailDto::fromEntity)
                .toList();
    }

    public InspectionStatusDetailDto createStatusDetail(
            InspectionStatusDetailDto dto
    ) {

        return InspectionStatusDetailDto.fromEntity(
                inspectionStatusDetailRepository.save(dto.toEntity())
        );
    }

    public void deleteStatusDetail(Long id) {
        inspectionStatusDetailRepository.deleteById(id);
    }
}