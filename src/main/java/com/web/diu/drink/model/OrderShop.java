package com.web.diu.drink.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class OrderShop implements Serializable {
    private int id;
    private int idUser;
    private String phone;
    private String address;
    private String payment;
    private String note;
    private Date date;
    private Time time;
    private User user;
    private double totalMoney;

    public OrderShop(int idUser, String phone, String address, String payment, String note, Date date, Time time) {
        this.idUser = idUser;
        this.phone = phone;
        this.address = address;
        this.payment = payment;
        this.note = note;
        this.date = date;
        this.time = time;
    }

    public OrderShop(int id, int idUser, String phone, String address, String payment, String note, Date date, Time time, double totalMoney) {
        this.id = id;
        this.idUser = idUser;
        this.phone = phone;
        this.address = address;
        this.payment = payment;
        this.note = note;
        this.date = date;
        this.time = time;
        this.totalMoney = totalMoney;
    }

    public OrderShop() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return this.idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public String getPayment() {
        return this.payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return this.time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotalMoney() {
        return this.totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
