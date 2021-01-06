package com.zking.movie.model;

public class RoleFunction {
    private Long roleFunctionId;

    private Long roleId;

    private Long functionId;

    public RoleFunction(Long roleFunctionId, Long roleId, Long functionId) {
        this.roleFunctionId = roleFunctionId;
        this.roleId = roleId;
        this.functionId = functionId;
    }

    public RoleFunction() {
        super();
    }

    public Long getRoleFunctionId() {
        return roleFunctionId;
    }

    public void setRoleFunctionId(Long roleFunctionId) {
        this.roleFunctionId = roleFunctionId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }
}