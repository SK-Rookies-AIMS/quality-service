package com.aims.quality.main_db.repository;

import com.aims.quality.main_db.entity.InspectionStatusDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionStatusDetailRepository
        extends JpaRepository<InspectionStatusDetail, Long> {
}