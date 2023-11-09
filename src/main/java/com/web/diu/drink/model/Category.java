package com.web.diu.drink.model;

import java.io.Serializable;

public class Category implements Serializable {
    private String id;
    private String idCateP;
    private String name;
    private int status;

    public Category() {
    }

    public Category(String id, String idCateP, String name) {
        this.id = id;
        this.idCateP = idCateP;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCateP() {
        return this.idCateP;
    }

    public void setIdCateP(String idCateP) {
        this.idCateP = idCateP;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
