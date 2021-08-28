package com.primebanc.primespringbootjavams.model;

public class FinancialProduct {
    private String productName;
    private String productID;
    private String productType;
    private String subcategory;
    private double buyPrice;
    private double marketPrice;
    private String productDescription;

    public FinancialProduct() {
    }

    public FinancialProduct( String productName, String productID, String productType, String subcategory, double buyPrice, double marketPrice, String productDescription) {
        this.productName = productName;
        this.productID = productID;
        this.productType = productType;
        this.subcategory = subcategory;
        this.buyPrice = buyPrice;
        this.marketPrice = marketPrice;
        this.productDescription = productDescription;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
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

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
