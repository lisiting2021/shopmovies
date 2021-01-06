package com.zking.movie.mapper;

import com.zking.movie.model.order;

public interface orderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(order record);

    int insertSelective(order record);

    order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(order record);

    int updateByPrimaryKey(order record);
}