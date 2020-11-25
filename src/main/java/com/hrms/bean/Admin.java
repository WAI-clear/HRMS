package com.hrms.bean;

public class Admin {
    private int aId;
    private String aName;
    private String aPasswd;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPasswd() {
        return aPasswd;
    }

    public void setaPasswd(String aPasswd) {
        this.aPasswd = aPasswd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aPasswd='" + aPasswd + '\'' +
                '}';
    }
}