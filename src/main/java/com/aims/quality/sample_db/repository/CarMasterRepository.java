package com.aims.quality.sample_db.repository;

import com.aims.quality.sample_db.entity.CarMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarMasterRepository
        extends JpaRepository<CarMaster, Long> {
}