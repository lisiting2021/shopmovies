package com.zking.movie.mapper;

import com.zking.movie.model.Personal;

public interface PersonalMapper {
    int deleteByPrimaryKey(Long personalId);

    int insert(Personal record);

    int insertSelective(Personal record);

    Personal selectByPrimaryKey(Long personalId);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);
}