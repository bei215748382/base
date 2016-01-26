package com.mlnx.base.mapper;

import com.mlnx.base.entity.TDevice;
import java.util.List;

public interface TDeviceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDevice record);

    TDevice selectByPrimaryKey(Integer id);

    List<TDevice> selectAll();

    int updateByPrimaryKey(TDevice record);
}