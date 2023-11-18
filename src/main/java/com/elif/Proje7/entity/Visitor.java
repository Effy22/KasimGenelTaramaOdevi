package com.elif.Proje7.entity;

public class Visitor extends User {

    public Visitor(String id, String userName, String password, String ipAdress) {
        super(id, userName, password, ipAdress);
    }

    public Visitor() {
    }

    @Override
    public String getIpAdress() {
        return super.getIpAdress();
    }


}
