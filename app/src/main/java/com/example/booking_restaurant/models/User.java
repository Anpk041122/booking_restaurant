package com.example.booking_restaurant.models;

public class User {
    private String phone;
    private String userName;
    private String role;
    public User(String phone, String userName, String role) {
        this.setPhone(phone);
        this.setUserName(userName);
        this.setRole(role);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
