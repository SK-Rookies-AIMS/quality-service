package com.aims.quality.main_db.repository;

import com.aims.quality.main_db.entity.InspectionRiskHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionRiskHistoryRepository
        extends JpaRepository<InspectionRiskHistory, Long> {
}
