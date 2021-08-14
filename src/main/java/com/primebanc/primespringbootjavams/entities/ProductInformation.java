package com.primebanc.primespringbootjavams.entities;

import com.primebanc.primespringbootjavams.enums.ProductSubCategory;
import com.primebanc.primespringbootjavams.enums.ProductType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ProductInformation {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "User_Name")
    private String userName;
    @Column(name = "Product_Name")
    private String productName;
    @Column(name = "Product_Id")
    private String productID;
    @Column(name = "Product_Type")
    private ProductType productType;
    @Column(name = "Sub_Category")
    private ProductSubCategory subcategory;
    @Column(name = "Buy_Price")
    private double buyPrice;
    @Column(name = "Market_Price")
    private double marketPrice;
    @Column(name = "Quantity")
    private int quantity;

    public ProductInformation() {
    }

    public ProductInformation(Long id, String userName, String productName, String productID, ProductType productType, ProductSubCategory subcategory, double buyPrice, double marketPrice, int quantity) {
        this.id = id;
        this.userName = userName;
        this.productName = productName;
        this.productID = productID;
        this.productType = productType;
        this.subcategory = subcategory;
        this.buyPrice = buyPrice;
        this.marketPrice = marketPrice;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductSubCategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(ProductSubCategory subcategory) {
        this.subcategory = subcategory;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
