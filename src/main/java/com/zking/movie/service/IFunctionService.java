package com.zking.movie.service;

import com.zking.movie.model.Function;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IFunctionService {
    int deleteByPrimaryKey(Long functionId);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Long functionId);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);

    List<Function> list(Integer parentId);
}
