package com.mlnx.base.mapper;

import com.mlnx.base.entity.TAddress;
import java.util.List;

public interface TAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAddress record);

    TAddress selectByPrimaryKey(Integer id);

    List<TAddress> selectAll();

    int updateByPrimaryKey(TAddress record);
}