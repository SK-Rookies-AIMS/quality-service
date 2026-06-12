package com.aims.quality.main_db.repository;

import com.aims.quality.main_db.entity.InspectionSummary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionSummaryRepository extends JpaRepository<InspectionSummary, Long> {
}
