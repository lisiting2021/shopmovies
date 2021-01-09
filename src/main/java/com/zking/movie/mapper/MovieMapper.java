package com.zking.movie.mapper;

import com.zking.movie.model.Movie;

import java.util.List;

public interface MovieMapper {
    int deleteByPrimaryKey(Long movieId);

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(Long movieId);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);

    List<Movie> list(Movie movie);
}