package com.primebanc.primespringbootjavams.model;

import java.time.LocalDate;

public class AuthenticatedUser {
    private String userName;
    private String userType;
    private boolean authenticated;
    private LocalDate userFrom;
    private LocalDate lastLoginDate;

    public AuthenticatedUser() {
    }

    public AuthenticatedUser(String userName, String userType, boolean authenticated, LocalDate userFrom, LocalDate lastLoginDate) {
        this.userName = userName;
        this.userType = userType;
        this.authenticated = authenticated;
        this.userFrom = userFrom;
        this.lastLoginDate = lastLoginDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public LocalDate getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(LocalDate userFrom) {
        this.userFrom = userFrom;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
