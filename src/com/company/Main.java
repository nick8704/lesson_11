package com.company;

public class Main {

    public static void main(String[] args) {
        testFruits();
    }

    private static void testFruits() {
        Fruit[] fruits = new Fruit[4];

        Fruit lemon = new Fruit();

        lemon.setType(Fruit.TYPE_LEMON);
        lemon.setColor(Fruit.COLOR_YELLOW);
        lemon.setWeight(0.096);
        lemon.setPricePerKg(36.99);
        lemon.setDateOfManufacture("09/03/2018");
        lemon.setExpirationDate(6);

        fruits[0] = lemon;

        Fruit banana = new Fruit();
        banana.setType(Fruit.TYPE_BANANA);
        banana.setColor(Fruit.COLOR_YELLOW);
        banana.setWeight(0.206);
        banana.setPricePerKg(37.99);
        banana.setDateOfManufacture("08/03/2018");
        banana.setExpirationDate(4);

        fruits[1] = banana;

        Fruit redApple = new Fruit();
        redApple.setType(Fruit.TYPE_APPLE);
        redApple.setColor(Fruit.COLOR_RED);
        redApple.setWeight(0.206);
        redApple.setPricePerKg(28.99);
        redApple.setDateOfManufacture("10/03/2018");
        redApple.setExpirationDate(15);

        fruits[2] = redApple;

        Fruit greenApple = new Fruit();
        greenApple.setType(Fruit.TYPE_APPLE);
        greenApple.setColor(Fruit.COLOR_GREEN);
        greenApple.setWeight(0.184);
        greenApple.setPricePerKg(20.99);
        greenApple.setDateOfManufacture("26/02/2018");
        greenApple.setExpirationDate(15);

        fruits[3] = greenApple;

        arrayToString(fruits);

        double sum = getSum(fruits);
        String sumFormat = String.format("%.2f", sum);
        System.out.println("Sum: " + sumFormat + " grn.");
        System.out.println();

        Fruit.printFreshness(fruits);
    }

    private static void arrayToString(Fruit[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    private static double getSum(Fruit[] fruits) {
        double result = 0;
        for (int i = 0; i < fruits.length; i++) {
            result += fruits[i].getPrice();
            String resultFormat = String.format("%.2f", result);
            System.out.println("Fruit[" + (i + 1) + "], price: " + resultFormat + " grn.");
        }
        return result;
    }
}