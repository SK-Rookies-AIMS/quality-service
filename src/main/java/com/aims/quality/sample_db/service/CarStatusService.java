package com.aims.quality.sample_db.service;

import com.aims.quality.sample_db.dto.CarStatusDto;
import com.aims.quality.sample_db.repository.CarStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarStatusService {

    private final CarStatusRepository carStatusRepository;

    public List<CarStatusDto> getCarStatusList() {

        return carStatusRepository.findAll()
                .stream()
                .map(CarStatusDto::fromEntity)
                .toList();
    }

    public CarStatusDto createCarStatus(
            CarStatusDto dto
    ) {

        return CarStatusDto.fromEntity(
                carStatusRepository.save(dto.toEntity())
        );
    }

    public void deleteCarStatus(Long id) {
        carStatusRepository.deleteById(id);
    }
}