package com.primebanc.primespringbootjavams.entities;

import com.primebanc.primespringbootjavams.enums.FundType;
import com.primebanc.primespringbootjavams.enums.MutualFundPaymentMode;
import com.primebanc.primespringbootjavams.enums.MutualFundRiskLevel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Mutual_Fund")
public class MutualFund {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "User_Name")
    private String userName;
    @Column(name = "Fund_Type")
    private FundType fundType;
    @Column(name = "Risk_Level")
    private MutualFundRiskLevel riskLevel;
    @Column(name = "Tenure")
    private int tenure;
    @Column(name = "Investment_Amount")
    private double investmentAmount;
    @Column(name = "Payment_Mode")
    private MutualFundPaymentMode paymentMode;
    @Column(name = "Maturity_Amount")
    private double maturityAmount;
    @Column(name = "Registration_Date")
    private LocalDate registrationDate;

    public MutualFund() {
    }

    public MutualFund(Long id, String userName, FundType fundType, MutualFundRiskLevel riskLevel, int tenure, double investmentAmount, MutualFundPaymentMode paymentMode, double maturityAmount, LocalDate registrationDate) {
        this.id = id;
        this.userName = userName;
        this.fundType = fundType;
        this.riskLevel = riskLevel;
        this.tenure = tenure;
        this.investmentAmount = investmentAmount;
        this.paymentMode = paymentMode;
        this.maturityAmount = maturityAmount;
        this.registrationDate = registrationDate;
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

    public FundType getFundType() {
        return fundType;
    }

    public void setFundType(FundType fundType) {
        this.fundType = fundType;
    }

    public MutualFundRiskLevel getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(MutualFundRiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public MutualFundPaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(MutualFundPaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public double getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(double maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
