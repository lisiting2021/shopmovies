package com.zking.movie.mapper;

import com.zking.movie.model.Cinema;

public interface CinemaMapper {
    int deleteByPrimaryKey(Long cinemaId);

    int insert(Cinema record);

    int insertSelective(Cinema record);

    Cinema selectByPrimaryKey(Long cinemaId);

    int updateByPrimaryKeySelective(Cinema record);

    int updateByPrimaryKey(Cinema record);
}