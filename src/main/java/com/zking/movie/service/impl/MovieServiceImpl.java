package com.zking.movie.service.impl;

import com.zking.movie.model.moviehall;
import com.zking.movie.service.IMovieServie;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements IMovieServie {


    @Override
    public int deleteByPrimaryKey(Long moviehallId) {
        return 0;
    }

    @Override
    public int insert(moviehall record) {
        return 0;
    }

    @Override
    public int insertSelective(moviehall record) {
        return 0;
    }

    @Override
    public moviehall selectByPrimaryKey(Long moviehallId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(moviehall record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(moviehall record) {
        return 0;
    }
}
