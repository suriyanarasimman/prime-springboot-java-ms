package com.primebanc.primespringbootjavams.model;

import org.springframework.lang.NonNull;

public class AuthenticationRequest {

    @NonNull
    private String userName;
    @NonNull
    private String password;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
