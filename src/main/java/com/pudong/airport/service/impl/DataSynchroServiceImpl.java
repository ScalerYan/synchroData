package com.pudong.airport.service.impl;

import com.pudong.airport.constants.NetLevel;
import com.pudong.airport.dao.mysql.MysqlDao;
import com.pudong.airport.dao.oracle.OracleDao;
import com.pudong.airport.model.*;
import com.pudong.airport.service.DataSynchroService;
import com.pudong.airport.util.DateUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jason on 17/6/4.
 */
@Service
public class DataSynchroServiceImpl implements DataSynchroService {
    private static Logger logger = Logger.getLogger(DataSynchroServiceImpl.class);

    @Autowired
    private OracleDao oracleDao;

    @Autowired
    private MysqlDao mysqlDao;

    @Override
    public void synchroResCpuUse() {
        logger.info("start fetch resCpuUseList...");
        List<ResCpuUse> resCpuUseList = oracleDao.getResCpuUse();
        if (resCpuUseList != null && resCpuUseList.size() > 0) {
            logger.info("start insert resCpuUseList into mysql...");
            mysqlDao.insertResCpuUse(resCpuUseList);
        }
        logger.info("synchronize RES_P_S_CPU_USE end...");
    }
}
