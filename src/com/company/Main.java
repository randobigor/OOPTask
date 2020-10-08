package com.company;

public class Main {

    public static void main(String[] args) {
        Car volkswagen = new Car("NRG 123");
        volkswagen.setCarType("Bus");
        volkswagen.setFuelType("Diesel");
        volkswagen.setSeatsNumber(20);

        System.out.println(volkswagen.getCarType());
        System.out.println(volkswagen.getRegNumber());
        System.out.println(volkswagen.getFuelType());
        System.out.println(volkswagen.getSeatsNumber());
        System.out.println("---------------");
        volkswagen.drive();
        volkswagen.stop();
    }
}
