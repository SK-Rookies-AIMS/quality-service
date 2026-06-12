package com.aims.quality.sample_db.repository;

import com.aims.quality.sample_db.entity.CarDynamics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDynamicsRepository
        extends JpaRepository<CarDynamics, Long> {
}