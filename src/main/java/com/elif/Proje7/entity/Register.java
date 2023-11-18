package com.elif.Proje7.entity;

import com.elif.Proje7.Enums.State;

import java.util.Date;

public class Register {

   String userName;
   String password;
    Date updateDate;
    State state;

    public Register() {
    }

    public Register(String userName, String password, Date updateDate, State state) {
        this.userName = userName;
        this.password = password;
        this.updateDate = updateDate;
        this.state = state;
    }

    public Register(String userName, String password, String registration) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Register{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", updateDate=" + updateDate +
                ", state=" + state +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
