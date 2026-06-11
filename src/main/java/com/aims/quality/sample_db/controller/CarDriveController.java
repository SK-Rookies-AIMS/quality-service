package com.aims.quality.sample_db.controller;

import com.aims.quality.sample_db.dto.CarDriveDto;
import com.aims.quality.sample_db.entity.CarDrive;
import com.aims.quality.sample_db.repository.CarDriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sample")
@RequiredArgsConstructor
public class CarDriveController {
    private final CarDriveRepository carDriveRepository;

    @GetMapping("/car-drive")
    public List<CarDriveDto> getCarDriveList() {

        List<CarDrive> driveList =
                carDriveRepository.findAll();

        return driveList.stream()
                .map(CarDriveDto::fromEntity)
                .toList();
    }
}
