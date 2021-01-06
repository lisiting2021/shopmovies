package com.zking.movie.mapper;

import com.zking.movie.model.RoleFunction;

public interface RoleFunctionMapper {
    int deleteByPrimaryKey(Long roleFunctionId);

    int insert(RoleFunction record);

    int insertSelective(RoleFunction record);

    RoleFunction selectByPrimaryKey(Long roleFunctionId);

    int updateByPrimaryKeySelective(RoleFunction record);

    int updateByPrimaryKey(RoleFunction record);
}