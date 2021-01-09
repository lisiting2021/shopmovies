package com.zking.movie.mapper;

import com.zking.movie.model.Function;
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

    List<Function> list(Integer parentId);

}