package com.example.ecommerce.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private long id;

    @Column(nullable = false)
    private String product_name;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private float price;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String picture_url;
    @Column(nullable = false,updatable = false)
    private String product_code;

    public Product(String product_name,int quantity,float price,String category,String picture_url){
        this.product_name=product_name;
        this.quantity=quantity;
        this.price=price;
        this.category=category;
        this.picture_url=picture_url;
    }

    public Product(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String s){
        this.product_code=s;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }
}
