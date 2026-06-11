package com.aims.quality.sample_db.service;

import com.aims.quality.sample_db.dto.CarDriveDto;
import com.aims.quality.sample_db.repository.CarDriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarDriveService {

    private final CarDriveRepository carDriveRepository;

    public List<CarDriveDto> getCarDriveList() {

        return carDriveRepository.findAll()
                .stream()
                .map(CarDriveDto::fromEntity)
                .toList();
    }

    public CarDriveDto createCarDrive(
            CarDriveDto dto
    ) {

        return CarDriveDto.fromEntity(
                carDriveRepository.save(dto.toEntity())
        );
    }

    public void deleteCarDrive(Long id) {
        carDriveRepository.deleteById(id);
    }
}