package com.pudong.airport.dao.mysql;

import com.pudong.airport.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by Jason on 17/6/4.
 */
@Mapper
public interface MysqlDao {

    void insertResCpuUse(List<ResCpuUse> resCpuUseList);

}
