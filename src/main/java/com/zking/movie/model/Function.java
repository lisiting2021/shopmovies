package com.zking.movie.model;

public class Function {
    private Long functionId;

    private String functionName;

    private String functionType;

    private Integer parentId;

    private String url;

    private String icon;

    public Function(Long functionId, String functionName, String functionType, Integer parentId, String url, String icon) {
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
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