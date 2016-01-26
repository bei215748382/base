package com.mlnx.base.mapper;

import com.mlnx.base.entity.TIdentity;
import java.util.List;

public interface TIdentityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TIdentity record);

    TIdentity selectByPrimaryKey(Integer id);

    List<TIdentity> selectAll();

    int updateByPrimaryKey(TIdentity record);
}