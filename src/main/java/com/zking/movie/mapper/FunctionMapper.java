package com.zking.movie.mapper;

import com.zking.movie.model.Function;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FunctionMapper {
    int deleteByPrimaryKey(Long functionId);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Long functionId);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);

    /**
     * 查询所有的父菜单
     * @return
     */
    List<Function> parent();

    /**
     * 查询所有子菜单
     * @param
     * @return
     */
    List<Function> son(Long functionId);

}