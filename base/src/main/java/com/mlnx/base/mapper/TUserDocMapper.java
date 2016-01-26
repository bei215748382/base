package com.mlnx.base.mapper;

import com.mlnx.base.entity.TUserDoc;
import java.util.List;

public interface TUserDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserDoc record);

    TUserDoc selectByPrimaryKey(Integer id);

    List<TUserDoc> selectAll();

    int updateByPrimaryKey(TUserDoc record);
}