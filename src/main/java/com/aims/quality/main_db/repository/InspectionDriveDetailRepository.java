package com.aims.quality.main_db.repository;

import com.aims.quality.main_db.entity.InspectionDriveDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InspectionDriveDetailRepository
        extends JpaRepository<InspectionDriveDetail, Long> {
    List<InspectionDriveDetail> findAllByOrderByIdDesc();
}