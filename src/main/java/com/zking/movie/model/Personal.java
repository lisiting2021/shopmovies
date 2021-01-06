package com.zking.movie.model;

public class Personal {
    private Long personalId;

    private String head;

    private String sex;

    private String brief;

    public Personal(Long personalId, String head, String sex, String brief) {
        this.personalId = personalId;
        this.head = head;
        this.sex = sex;
        this.brief = brief;
    }

    public Personal() {
        super();
    }

    public Long getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Long personalId) {
        this.personalId = personalId;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }
}