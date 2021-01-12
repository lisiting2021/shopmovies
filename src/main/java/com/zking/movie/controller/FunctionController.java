package com.zking.movie.controller;

import com.zking.movie.model.Function;
import com.zking.movie.service.IFunctionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/FunctionController")
public class FunctionController {

    @Autowired
    private IFunctionService iFunctionService;

    @RequestMapping("/list")
    @ResponseBody
    public Map list(Function function){
        System.out.println("123456");
        //定义一个list用来保存所有的父节点
        List<Function> list=new ArrayList();
        if(function.getParentId()==null||function.getParentId().equals(0)){
            //调用查询所有父节点的方法
            list = iFunctionService.parent();
            System.out.println("父节点长度："+list.size());
            for (Function fun : list) {
                System.out.println("父节点"+fun);
                //定义放子菜单的list
                fun.setChildren(iFunctionService.son(fun.getFunctionId()));
//                for (Function function1 : son) {
//                    //把子菜单加到父菜单中
//                    fun.getChildren().add(function1);
//                    System.out.println("子节点"+function1);
//                }
            }
        }
        Map<String,Object> map=new HashMap<>();
        map.put("map",list);
        return map;
    }
}
