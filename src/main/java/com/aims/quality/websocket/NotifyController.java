package com.aims.quality.websocket;

import com.aims.quality.main_db.dto.InspectionDriveDetailDto;
import com.aims.quality.main_db.dto.InspectionProcessDto;
import com.aims.quality.main_db.dto.InspectionStatusDetailDto;
import com.aims.quality.main_db.dto.InspectionSummaryDto;
import com.aims.quality.main_db.service.InspectionDriveDetailService;
import com.aims.quality.main_db.service.InspectionProcessService;
import com.aims.quality.main_db.service.InspectionStatusDetailService;
import com.aims.quality.main_db.service.InspectionSummaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/internal/notify")
public class NotifyController {

    private final InspectionSummaryService summaryService;
    private final InspectionProcessService processService;
    private final InspectionDriveDetailService driveService;
    private final InspectionStatusDetailService statusService;

    private final WebSocketPushService pushService;

    @PostMapping("/summary")
    public void notifySummary(){

        InspectionSummaryDto dto =
                summaryService.getLatestSummary();

        pushService.sendSummary(dto);
    }

    @PostMapping("/process")
    public void notifyProcess(){

        List<InspectionProcessDto> dto =
                processService.getProcessList();

        pushService.sendProcess(dto);

    }

    @PostMapping("/drive")
    public void notifyDrive(){

        List<InspectionDriveDetailDto> dto =
                driveService.getDriveDetailList();

        pushService.sendDrive(dto);

    }

    @PostMapping("/status")
    public void notifyStatus(){

        List<InspectionStatusDetailDto> dto =
                statusService.getStatusDetailList();

        pushService.sendStatus(dto);

    }

}