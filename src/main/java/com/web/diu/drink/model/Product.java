package com.web.diu.drink.model;

import java.io.Serializable;
import java.sql.Date;

public class Product implements Serializable {
    private int id;
    private String name;
    private String idCate;
    private String image_link;
    private String image_list;
    private String description;
    private Date date;
    private double price;
    private double priceDiscount;
    private int left;
    private int sold;
    private double discount;
    private String nameCategory;
    private int status;

    public Product(int id, String name, String image_link, double price, double discount) {
        this.id = id;
        this.name = name;
        this.image_link = image_link;
        this.price = price;
        this.discount = discount;
    }

    public Product() {
    }

    public Product(int id, String name, String idCate, String image_link, String image_list, String description, Date date, double price, int left, int sold) {
        this.id = id;
        this.name = name;
        this.idCate = idCate;
        this.image_link = image_link;
        this.image_list = image_list;
        this.description = description;
        this.date = date;
        this.price = price;
        this.left = left;
        this.sold = sold;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCate() {
        return this.idCate;
    }

    public void setIdCate(String idCate) {
        this.idCate = idCate;
    }

    public String getImage_link() {
        return this.image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getImage_list() {
        return this.image_list;
    }

    public void setImage_list(String image_list) {
        this.image_list = image_list;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLeft() {
        return this.left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getSold() {
        return this.sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public double getPriceDiscount() {
        return this.priceDiscount;
    }

    public void setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public String getNameCategory() {
        return this.nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
