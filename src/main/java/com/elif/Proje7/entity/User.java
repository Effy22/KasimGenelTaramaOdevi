package com.elif.Proje7.entity;

public abstract class User implements IUser{
    private String id;
    private String userName;
    private String password;
    private String ipAdress;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", ipAdress='" + ipAdress + '\'' +
                '}';
    }

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String id, String userName, String password, String ipAdress) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.ipAdress = ipAdress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    @Override
    public void surfWebPages() {

    }
}
