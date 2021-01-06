package com.zking.movie.mapper;

import com.zking.movie.model.Session;

public interface SessionMapper {
    int deleteByPrimaryKey(Long sessionId);

    int insert(Session record);

    int insertSelective(Session record);

    Session selectByPrimaryKey(Long sessionId);

    int updateByPrimaryKeySelective(Session record);

    int updateByPrimaryKey(Session record);
}