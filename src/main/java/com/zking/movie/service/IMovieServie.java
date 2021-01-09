package com.zking.movie.service;

import com.zking.movie.model.moviehall;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IMovieServie {

    int deleteByPrimaryKey(Long moviehallId);

    int insert(moviehall record);

    int insertSelective(moviehall record);

    moviehall selectByPrimaryKey(Long moviehallId);

    int updateByPrimaryKeySelective(moviehall record);

    int updateByPrimaryKey(moviehall record);
}
