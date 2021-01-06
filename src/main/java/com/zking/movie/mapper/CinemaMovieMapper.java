package com.zking.movie.mapper;

import com.zking.movie.model.CinemaMovie;

public interface CinemaMovieMapper {
    int deleteByPrimaryKey(Long cinemaMovieId);

    int insert(CinemaMovie record);

    int insertSelective(CinemaMovie record);

    CinemaMovie selectByPrimaryKey(Long cinemaMovieId);

    int updateByPrimaryKeySelective(CinemaMovie record);

    int updateByPrimaryKey(CinemaMovie record);
}