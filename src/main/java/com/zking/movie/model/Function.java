package com.zking.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class Function {
    private Long functionId;

    private String functionName;

    private String functionType;

    private Long parentId;

    private String url;

    private String icon;

//    一对多映射
    private List<Function> children=new ArrayList<>();

    //多对一映射
    @JsonIgnore
    private Function function;

    public Function(Long functionId, String functionName, String functionType, Long parentId, String url, String icon) {
        this.functionId = functionId;
        this.functionName = functionName;
        this.functionType = functionType;
        this.parentId = parentId;
        this.url = url;
        this.icon = icon;
    }

    public Function() {
        super();
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        System.out.println("设置值了："+parentId);
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}