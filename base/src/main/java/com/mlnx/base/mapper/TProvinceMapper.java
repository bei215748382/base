package com.mlnx.base.mapper;

import com.mlnx.base.entity.TProvince;
import java.util.List;

public interface TProvinceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TProvince record);

    TProvince selectByPrimaryKey(Integer id);

    List<TProvince> selectAll();

    int updateByPrimaryKey(TProvince record);
}