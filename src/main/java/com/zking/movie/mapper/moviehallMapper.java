package com.zking.movie.mapper;

import com.zking.movie.model.moviehall;

public interface moviehallMapper {
    int deleteByPrimaryKey(Long moviehallId);

    int insert(moviehall record);

    int insertSelective(moviehall record);

    moviehall selectByPrimaryKey(Long moviehallId);

    int updateByPrimaryKeySelective(moviehall record);

    int updateByPrimaryKey(moviehall record);
}