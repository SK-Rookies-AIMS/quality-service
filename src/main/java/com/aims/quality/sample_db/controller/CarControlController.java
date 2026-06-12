package com.aims.quality.sample_db.controller;

import com.aims.quality.sample_db.dto.CarControlDto;
import com.aims.quality.sample_db.entity.CarControl;
import com.aims.quality.sample_db.repository.CarControlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quality/sample")
@RequiredArgsConstructor
public class CarControlController {
    private final CarControlRepository carControlRepository;

    @GetMapping("/car-control")
    public List<CarControlDto> getCarControlList() {

        List<CarControl> controlList =
                carControlRepository.findAll();

        return controlList.stream()
                .map(CarControlDto::fromEntity)
                .toList();
    }
}
