package com.web.diu.drink.model;

import java.io.Serializable;

public class OrderShopDetail implements Serializable {
    private int id;
    private int idProduct;
    private int idOrderShop;
    private int quantity;
    private Product product;
    private OrderShop order;

    public OrderShopDetail(int idProduct, int idOrderShop, int quantity) {
        this.idProduct = idProduct;
        this.idOrderShop = idOrderShop;
        this.quantity = quantity;
    }

    public OrderShopDetail(int id, int idProduct, int idOrderShop, int quantity) {
        this.id = id;
        this.idProduct = idProduct;
        this.idOrderShop = idOrderShop;
        this.quantity = quantity;
    }

    public OrderShopDetail() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdOrderShop() {
        return this.idOrderShop;
    }

    public void setIdOrderShop(int idOrderShop) {
        this.idOrderShop = idOrderShop;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderShop getOrder() {
        return this.order;
    }

    public void setOrder(OrderShop order) {
        this.order = order;
    }
}
