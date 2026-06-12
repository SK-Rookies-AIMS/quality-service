package com.aims.quality.sample_db.service;

import com.aims.quality.sample_db.dto.CarMasterDto;
import com.aims.quality.sample_db.repository.CarMasterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarMasterService {

    private final CarMasterRepository carMasterRepository;

    public List<CarMasterDto> getCarMasterList() {

        return carMasterRepository.findAll()
                .stream()
                .map(CarMasterDto::fromEntity)
                .toList();
    }

    public CarMasterDto createCarMaster(
            CarMasterDto dto
    ) {

        return CarMasterDto.fromEntity(
                carMasterRepository.save(dto.toEntity())
        );
    }

    public void deleteCarMaster(Long id) {
        carMasterRepository.deleteById(id);
    }
}