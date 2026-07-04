package com.aims.quality.main_db.repository;

import com.aims.quality.main_db.entity.InspectionProcess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InspectionProcessRepository
        extends JpaRepository<InspectionProcess, Long> {
    List<InspectionProcess> findAllByOrderByIdAsc();
}
