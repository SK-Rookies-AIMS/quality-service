package com.aims.quality.sample_db.repository;

import com.aims.quality.sample_db.entity.CarStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarStatusRepository
        extends JpaRepository<CarStatus, Long> {
}