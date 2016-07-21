package com.aaa.bbb.entity;

/**
 * Created by Administrator on 2016/7/10.
 */

public class User {
    private int id;
    private String username;
    private String password;

    public User(){}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
