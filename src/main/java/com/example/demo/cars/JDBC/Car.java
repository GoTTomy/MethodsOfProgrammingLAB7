package com.example.demo.cars.JDBC;

public class Car {
    private String make,registration;

    public Car(){

    }

    public Car(String make,String registration){
        this.make=make;
        this.registration=registration;
    }

    public String getRegistration() {
        return registration;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
}
