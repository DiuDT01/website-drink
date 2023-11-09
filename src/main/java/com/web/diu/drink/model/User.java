package com.web.diu.drink.model;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String username;
    private String email;
    private String password;
    private String phone;
    private String address;
    private int isadmin;

    public User() {
    }

    public User(String username, String email, String password, String phone, String address, int isadmin) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.isadmin = isadmin;
    }

    public User(String username, String email, String password, String phone, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsadmin() {
        return this.isadmin;
    }

    public void setIsadmin(int isadmin) {
        this.isadmin = isadmin;
    }
}
