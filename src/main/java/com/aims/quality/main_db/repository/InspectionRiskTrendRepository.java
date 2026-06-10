package com.aims.quality.main_db.repository;

import com.aims.quality.main_db.entity.InspectionRiskTrend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionRiskTrendRepository
        extends JpaRepository<InspectionRiskTrend, Long> {
}