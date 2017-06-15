package com.pudong.airport.dao.oracle;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Jason on 17/6/4.
 */
@Mapper
public interface OracleDao {

    List getResCpuUse();

}
