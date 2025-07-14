package com.javafx.model.domain.product;

import com.javafx.model.domain.ProductTypeEnum;

public class Product {

    private String productName;
    private double price;
    private int quantity;
    private ProductTypeEnum productType;

    public Product() {
    }

    public Product(String productName, double price, int quantity, ProductTypeEnum productType) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productType = productType;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductTypeEnum getProductType() {
        return productType;
    }
}

