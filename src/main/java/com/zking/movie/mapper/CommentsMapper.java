package com.zking.movie.mapper;

import com.zking.movie.model.Comments;

public interface CommentsMapper {
    int deleteByPrimaryKey(Long commentsId);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(Long commentsId);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);
}