package com.example.booking_restaurant.models;

import java.util.List;
import java.util.Map;
public class Restaurant {
    private String name;
    private String address;
    private Double rating;
    private String restaurantType;

    public Restaurant(String name, String address, Double rating, String restaurantType){
        this.setName(name);
        this.setAddress(address);
        this.setRating(rating);
        this.setRestaurantType(restaurantType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }
}
