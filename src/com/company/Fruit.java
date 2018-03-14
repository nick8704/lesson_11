package com.company;

public class Fruit {

    public static final int TYPE_APPLE = 1;
    public static final int TYPE_LEMON = 2;
    public static final int TYPE_BANANA = 3;

    public static final String COLOR_YELLOW = "yellow";
    public static final String COLOR_GREEN = "green";
    public static final String COLOR_RED = "red";

    private int type;
    private String color;
    private double weight;
    private double pricePerKg;
    private String dateOfManufacture;
    private int expirationDate;

    public void setType(int type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type = " + type +
                ", color = " + color +
                ", weight = " + weight +
                ", pricePerKg = " + pricePerKg +
                ", dateOfManufacture = " + dateOfManufacture +
                ", expirationDate = " + expirationDate +
                '}';
    }

    public double getPrice() {
        return weight * pricePerKg;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public int getExpirationDate() {
        return expirationDate;
    }
}