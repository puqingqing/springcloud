package com.example.customer_feign.bean;

public class User {
    private String User;
    private String password;

    public User() {
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "User='" + User + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
