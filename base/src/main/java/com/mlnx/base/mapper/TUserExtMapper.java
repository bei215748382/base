package com.mlnx.base.mapper;

import com.mlnx.base.entity.TUserExt;
import java.util.List;

public interface TUserExtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserExt record);

    TUserExt selectByPrimaryKey(Integer id);

    List<TUserExt> selectAll();

    int updateByPrimaryKey(TUserExt record);
}