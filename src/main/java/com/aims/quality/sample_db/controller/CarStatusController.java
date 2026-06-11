package com.aims.quality.sample_db.controller;

import com.aims.quality.sample_db.dto.CarStatusDto;
import com.aims.quality.sample_db.entity.CarStatus;
import com.aims.quality.sample_db.repository.CarStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sample")
@RequiredArgsConstructor
public class CarStatusController {
    private final CarStatusRepository carStatusRepository;

    @GetMapping("/car-status")
    public List<CarStatusDto> getCarStatusList() {

        List<CarStatus> statusList =
                carStatusRepository.findAll();

        return statusList.stream()
                .map(CarStatusDto::fromEntity)
                .toList();
    }
}
