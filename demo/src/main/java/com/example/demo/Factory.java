package com.example.demo;

public class Factory {

    public Car createCargo(String color, int yearofManufacture){
        Car cargo = new Car(6,50);
        return cargo;
    }

    public Car createPersonal(String color, int yearofManufacture){
        Car Personal = new Car(4,17);
        return Personal;

    }
}

