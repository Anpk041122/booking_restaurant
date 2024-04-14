package com.example.booking_restaurant.data.models;

public class Region {

    private String uuid;
    private String name;
    private String idRestaurant;
    private String restaurantName;

    public Region(String uuid, String name, String idRestaurant, String restaurantName){
        this.setUuid(uuid);
        this.setName(name);
        this.setIdRestaurant(idRestaurant);
        this.setRestaurantName(restaurantName);
    }
    public Region(){}

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(String idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
