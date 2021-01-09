package com.zking.movie.service.impl;

import com.zking.movie.mapper.FunctionMapper;
import com.zking.movie.model.Function;
import com.zking.movie.service.IFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionServiceImpl implements IFunctionService {

    @Autowired
    private FunctionMapper functionMapper;

    @Override
    public int deleteByPrimaryKey(Long functionId) {
        return functionMapper.deleteByPrimaryKey(functionId);
    }

    @Override
    public int insert(Function record) {
        return functionMapper.insert(record);
    }

    @Override
    public int insertSelective(Function record) {
        return functionMapper.insertSelective(record);
    }

    @Override
    public Function selectByPrimaryKey(Long functionId) {
        return functionMapper.selectByPrimaryKey(functionId);
    }

    @Override
    public int updateByPrimaryKeySelective(Function record) {
        return functionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Function record) {
        return functionMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Function> list(Integer parentId) {
        return functionMapper.list(parentId);
    }
}
