package com.mlnx.base.mapper;

import com.mlnx.base.entity.TCity;
import java.util.List;

public interface TCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCity record);

    TCity selectByPrimaryKey(Integer id);

    List<TCity> selectAll();

    int updateByPrimaryKey(TCity record);
}