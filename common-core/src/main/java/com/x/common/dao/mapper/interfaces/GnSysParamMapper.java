package com.x.common.dao.mapper.interfaces;

import com.x.common.dao.mapper.bo.GnSysParam;
import com.x.common.dao.mapper.bo.GnSysParamCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GnSysParamMapper {
    long countByExample(GnSysParamCriteria example);

    int deleteByExample(GnSysParamCriteria example);

    int deleteByPrimaryKey(String guidkey);

    int insert(GnSysParam record);

    int insertSelective(GnSysParam record);

    List<GnSysParam> selectByExample(GnSysParamCriteria example);

    GnSysParam selectByPrimaryKey(String guidkey);

    int updateByExampleSelective(@Param("record") GnSysParam record, @Param("example") GnSysParamCriteria example);

    int updateByExample(@Param("record") GnSysParam record, @Param("example") GnSysParamCriteria example);

    int updateByPrimaryKeySelective(GnSysParam record);

    int updateByPrimaryKey(GnSysParam record);
}