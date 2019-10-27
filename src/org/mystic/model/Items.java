package org.mystic.model;

public class Items {
    private int id;
    private String description;
    private Double price;
    private String brand;

    public Items() {
    }

    public Items(int id, String description, Double price, String brand) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
