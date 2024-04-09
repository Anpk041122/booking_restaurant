package com.example.booking_restaurant.models;

public class User {
    private String userId;
    private String role;

    public User(String userId, String role) {
        this.setUserId(userId);
        this.setRole(role);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
