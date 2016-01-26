package com.mlnx.base.mapper;

import com.mlnx.base.entity.TVoipAccount;
import java.util.List;

public interface TVoipAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TVoipAccount record);

    TVoipAccount selectByPrimaryKey(Integer id);

    List<TVoipAccount> selectAll();

    int updateByPrimaryKey(TVoipAccount record);
}