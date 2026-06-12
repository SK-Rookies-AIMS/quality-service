package com.aims.quality.sample_db.service;

import com.aims.quality.sample_db.dto.CarDynamicsDto;
import com.aims.quality.sample_db.repository.CarDynamicsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarDynamicsService {

    private final CarDynamicsRepository carDynamicsRepository;

    public List<CarDynamicsDto> getCarDynamicsList() {

        return carDynamicsRepository.findAll()
                .stream()
                .map(CarDynamicsDto::fromEntity)
                .toList();
    }

    public CarDynamicsDto createCarDynamics(
            CarDynamicsDto dto
    ) {

        return CarDynamicsDto.fromEntity(
                carDynamicsRepository.save(dto.toEntity())
        );
    }

    public void deleteCarDynamics(Long id) {
        carDynamicsRepository.deleteById(id);
    }
}