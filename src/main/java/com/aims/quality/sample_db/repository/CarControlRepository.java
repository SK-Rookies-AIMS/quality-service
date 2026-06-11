package com.aims.quality.sample_db.repository;

import com.aims.quality.sample_db.entity.CarControl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarControlRepository
        extends JpaRepository<CarControl, Long> {
}