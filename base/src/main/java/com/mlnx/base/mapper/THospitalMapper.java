package com.mlnx.base.mapper;

import com.mlnx.base.entity.THospital;
import java.util.List;

public interface THospitalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(THospital record);

    THospital selectByPrimaryKey(Integer id);

    List<THospital> selectAll();

    int updateByPrimaryKey(THospital record);
}