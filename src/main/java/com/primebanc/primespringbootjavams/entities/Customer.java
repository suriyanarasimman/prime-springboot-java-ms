package com.primebanc.primespringbootjavams.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "User_Name")
    private String userName;
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Organization_Name")
    private String organizationName;
    @Column(name = "Registered_Date")
    private LocalDate registeredDate;
    @Column(name = "Pan_Number")
    private String panNumber;
    @Column(name = "Password")
    private String password;
    @Column(name = "Address01")
    private String addressLine01;
    @Column(name = "Address02")
    private String addressLine02;
    @Column(name = "State")
    private String state;
    @Column(name = "Country")
    private String country;
    @Column(name = "Pincode")
    private String pincode;
    @Column(name = "UserType")
    private String userType;
    @Column(name = "LastLogInDate")
    private LocalDate lastLogInDate;

    public Customer() {
    }

    public Customer(Long id, String userName, String firstName, String lastName, String email, String organizationName, LocalDate registeredDate, String panNumber, String password, String addressLine01, String addressLine02, String state, String country, String pincode, String userType, LocalDate lastLogInDate) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.organizationName = organizationName;
        this.registeredDate = registeredDate;
        this.panNumber = panNumber;
        this.password = password;
        this.addressLine01 = addressLine01;
        this.addressLine02 = addressLine02;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.userType = userType;
        this.lastLogInDate = lastLogInDate;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddressLine01() {
        return addressLine01;
    }

    public void setAddressLine01(String addressLine01) {
        this.addressLine01 = addressLine01;
    }

    public String getAddressLine02() {
        return addressLine02;
    }

    public void setAddressLine02(String addressLine02) {
        this.addressLine02 = addressLine02;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public LocalDate getLastLogInDate() {
        return lastLogInDate;
    }

    public void setLastLogInDate(LocalDate lastLogInDate) {
        this.lastLogInDate = lastLogInDate;
    }
}
