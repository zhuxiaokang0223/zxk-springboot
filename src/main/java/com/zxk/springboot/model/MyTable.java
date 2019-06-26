package com.zxk.springboot.model;

public class MyTable {
    private Integer id;

    private String name;

    private String mytablecol;

    private Integer signDay;

    private String studentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMytablecol() {
        return mytablecol;
    }

    public void setMytablecol(String mytablecol) {
        this.mytablecol = mytablecol;
    }

    public Integer getSignDay() {
        return signDay;
    }

    public void setSignDay(Integer signDay) {
        this.signDay = signDay;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
}