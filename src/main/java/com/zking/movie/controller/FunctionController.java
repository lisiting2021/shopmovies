package com.zking.movie.controller;

import com.zking.movie.model.Function;
import com.zking.movie.service.IFunctionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/FunctionController")
public class FunctionController {

    @Autowired
    private IFunctionService iFunctionService;

    @RequestMapping("/list")
    @ResponseBody
    public List list(Function function){
        System.out.println("12345");
        System.out.println("parentId："+function.getParentId());

        List<Function> list = iFunctionService.list(function.getParentId());
        return list;
    }
}
