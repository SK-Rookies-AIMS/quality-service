package com.aims.quality.main_db.repository;

import com.aims.quality.main_db.entity.InspectionDriveDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionDriveDetailRepository
        extends JpaRepository<InspectionDriveDetail, Long> {
}