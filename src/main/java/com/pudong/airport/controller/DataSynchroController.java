package com.pudong.airport.controller;


import com.pudong.airport.service.DataSynchroService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 用户控制层
 * <p>
 * Created by Jason on 04/06/2017.
 */
@Component
public class DataSynchroController {
    private static Logger logger = Logger.getLogger(DataSynchroController.class);

    @Autowired
    private DataSynchroService dataSynchroService;

    @Scheduled(cron = "10 0/1 * * * ?")
    public void synchronizeResPerformUse() {
        logger.info("increment synchronize: RES_P_S_CPU_USE...");
        dataSynchroService.synchroResCpuUse();

    }
}
