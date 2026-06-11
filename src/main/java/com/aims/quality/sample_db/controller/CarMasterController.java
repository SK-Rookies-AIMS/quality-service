package com.aims.quality.sample_db.controller;

import com.aims.quality.sample_db.dto.CarMasterDto;
import com.aims.quality.sample_db.entity.CarMaster;
import com.aims.quality.sample_db.repository.CarMasterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sample")
@RequiredArgsConstructor
public class CarMasterController {
    private final CarMasterRepository carMasterRepository;

    @GetMapping("/cars")
    public List<CarMasterDto> getCarMasterList() {

        List<CarMaster> masterList =
                carMasterRepository.findAll();

        return masterList.stream()
                .map(CarMasterDto::fromEntity)
                .toList();
    }
}
