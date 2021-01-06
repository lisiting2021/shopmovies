package com.zking.movie.model;

public class User {
    private Long userId;

    private String userName;

    private String userPassword;

    private Integer userState;

    private String salt;

    private Long roleId;

    private Long personalId;

    public User(Long userId, String userName, String userPassword, Integer userState, String salt, Long roleId, Long personalId) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userState = userState;
        this.salt = salt;
        this.roleId = roleId;
        this.personalId = personalId;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Long personalId) {
        this.personalId = personalId;
    }
}