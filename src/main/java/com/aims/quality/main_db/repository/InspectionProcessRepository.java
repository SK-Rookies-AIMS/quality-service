package com.aims.quality.main_db.repository;

import com.aims.quality.main_db.entity.InspectionProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InspectionProcessRepository
        extends JpaRepository<InspectionProcess, Long> {
    List<InspectionProcess> findAllByOrderByIdAsc();

    @Query(value = """
        SELECT *
        FROM inspection_process
        WHERE DATE(created_at) = (
            SELECT DATE(MAX(created_at))
            FROM inspection_process
        )
        ORDER BY FIELD(process_name,'VISUAL','FUNCTION','DRIVE','FINAL')
        """, nativeQuery = true)
            List<InspectionProcess> findLatestProcess();
}
