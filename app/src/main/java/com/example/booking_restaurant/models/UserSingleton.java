package com.example.booking_restaurant.models;

public class UserSingleton {
    private static UserSingleton instance;
    private String userID;
    private String userName;

    private UserSingleton() {
        // Private constructor to prevent instantiation from other classes
    }

    public static synchronized UserSingleton getInstance() {
        if (instance == null) {
            instance = new UserSingleton();
        }
        return instance;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
