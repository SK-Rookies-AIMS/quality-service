package com.aims.quality.sample_db.controller;

import com.aims.quality.sample_db.dto.CarDynamicsDto;
import com.aims.quality.sample_db.entity.CarDynamics;
import com.aims.quality.sample_db.repository.CarDynamicsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quality/sample")
@RequiredArgsConstructor
public class CarDynamicsController {
    private final CarDynamicsRepository carDynamicsRepository;

    @GetMapping("/car-dynamics")
    public List<CarDynamicsDto> getCarDynamicsList() {

        List<CarDynamics> dynamicsList =
                carDynamicsRepository.findAll();

        return dynamicsList.stream()
                .map(CarDynamicsDto::fromEntity)
                .toList();
    }
}