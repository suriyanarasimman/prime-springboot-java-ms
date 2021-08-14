package com.primebanc.primespringbootjavams.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "IpoInformation")
public class IpoInformation {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Username")
    private String userName;
    @Column(name = "Company_Name")
    private String companyName;
    @Column(name = "Market_Cap")
    private double marketCap;
    @Column(name = "Sale_Percent")
    private double salePercentage;
    @Column(name = "Description")
    private String description;
    @Column(name = "Issue_Date")
    private LocalDate issueDate;
    @Column(name = "Issue_Size")
    private long issueSize;
    @Column(name = "Issue_Price")
    private double issuePrice;
    @Column(name = "Lot_Size")
    private long lotSize;
    @Column(name = "Closing_Date")
    private LocalDate closingDate;

    public IpoInformation() {
    }

    public IpoInformation(Long id, String userName, String companyName, double marketCap, double salePercentage, String description, LocalDate issueDate, long issueSize, double issuePrice, long lotSize, LocalDate closingDate) {
        this.id = id;
        this.userName = userName;
        this.companyName = companyName;
        this.marketCap = marketCap;
        this.salePercentage = salePercentage;
        this.description = description;
        this.issueDate = issueDate;
        this.issueSize = issueSize;
        this.issuePrice = issuePrice;
        this.lotSize = lotSize;
        this.closingDate = closingDate;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getSalePercentage() {
        return salePercentage;
    }

    public void setSalePercentage(double salePercentage) {
        this.salePercentage = salePercentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public long getIssueSize() {
        return issueSize;
    }

    public void setIssueSize(long issueSize) {
        this.issueSize = issueSize;
    }

    public double getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(double issuePrice) {
        this.issuePrice = issuePrice;
    }

    public long getLotSize() {
        return lotSize;
    }

    public void setLotSize(long lotSize) {
        this.lotSize = lotSize;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }
}
