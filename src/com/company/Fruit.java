package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

    private static boolean isFresh(String dateOfManufacture, int expirationDate) throws Exception {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateFruit = simpleDateFormat.parse(dateOfManufacture);
        Calendar calendarToday = Calendar.getInstance();
        calendarToday.setTime(today);
        Calendar calendarFruit = Calendar.getInstance();
        calendarFruit.setTime(dateFruit);
        calendarFruit.add(Calendar.DAY_OF_MONTH, expirationDate);
        if (calendarFruit.before(calendarToday)) {
            return false;
        } else {
            return true;
        }
    }

    public static void printFreshness(Fruit[] fruits) {
        try {
            for (int i = 0; i < fruits.length; i++) {
                if (isFresh(fruits[i].dateOfManufacture, fruits[i].expirationDate)) {
                    System.out.println("Fruit[" + (i + 1) + "] is fresh");
                } else {
                    System.out.println("Fruit[" + (i + 1) + "] is not fresh");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}