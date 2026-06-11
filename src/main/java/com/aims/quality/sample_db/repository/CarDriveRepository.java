package com.aims.quality.sample_db.repository;

import com.aims.quality.sample_db.entity.CarDrive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDriveRepository
        extends JpaRepository<CarDrive, Long> {
}