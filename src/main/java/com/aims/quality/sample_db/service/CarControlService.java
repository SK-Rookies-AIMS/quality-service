package com.aims.quality.sample_db.service;

import com.aims.quality.sample_db.dto.CarControlDto;
import com.aims.quality.sample_db.repository.CarControlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarControlService {

    private final CarControlRepository carControlRepository;

    public List<CarControlDto> getCarControlList() {

        return carControlRepository.findAll()
                .stream()
                .map(CarControlDto::fromEntity)
                .toList();
    }

    public CarControlDto createCarControl(
            CarControlDto dto
    ) {

        return CarControlDto.fromEntity(
                carControlRepository.save(dto.toEntity())
        );
    }

    public void deleteCarControl(Long id) {
        carControlRepository.deleteById(id);
    }
}