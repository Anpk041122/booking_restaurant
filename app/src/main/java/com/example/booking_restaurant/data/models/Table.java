package com.example.booking_restaurant.data.models;

public class Table {
    private String price;
    private String floorId;
    private String typeId;
    private boolean status;

    public Table(String price, String floorId, String typeId, boolean status){
        this.setFloorId(floorId);
        this.setPrice(price);
        this.setTypeId(typeId);
        this.setStatus(status);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
