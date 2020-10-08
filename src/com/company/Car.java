package com.company;

public class Car {
    private String regNumber;
    private String carType;
    private String fuelType;
    private int seatsNumber;

    public Car(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRegNumber(){
        return this.regNumber;
    }

    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }

    public String getCarType(){
        return this.carType;
    }

    public void setCarType(String carType){
        this.carType = carType;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public int getSeatsNumber(){
        return this.seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber){
        this.seatsNumber = seatsNumber;
    }

    public void drive(){
        System.out.println("The car drove");
    }

    public void stop(){
        System.out.println("Car stopped");
    }
}
