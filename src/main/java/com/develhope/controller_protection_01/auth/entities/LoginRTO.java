package com.develhope.controller_protection_01.auth.entities;

import com.develhope.controller_protection_01.entities.User;

public class LoginRTO {

    private User user;
    private String JWT;

    public LoginRTO(User user, String JWT) {
        this.user = user;
        this.JWT = JWT;
    }

    public LoginRTO() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getJWT() {
        return JWT;
    }

    public void setJWT(String JWT) {
        this.JWT = JWT;
    }
}
