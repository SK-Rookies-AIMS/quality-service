package com.aims.quality.main_db.repository;

import com.aims.quality.main_db.entity.InspectionStatusDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InspectionStatusDetailRepository
        extends JpaRepository<InspectionStatusDetail, Long> {
    List<InspectionStatusDetail> findAllByOrderByIdDesc();
}