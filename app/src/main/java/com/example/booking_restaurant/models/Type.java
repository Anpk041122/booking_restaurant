package com.example.booking_restaurant.models;

public class Type {
    private String name;
    private String count;

    public Type(String name, String count){
        this.setName(name);
        this.setCount(count);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
