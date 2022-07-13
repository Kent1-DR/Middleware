package com.example.demo;

import java.util.ArrayList;

public class Car {
    private int yearofManufacture;
    private String color;
    private ArrayList<Wheel> wheels;

    public Car(int wheels, float diameters, String color, int yearofManufacture){
        this.wheels = new ArrayList<>();
        this.color = color;
        this.yearofManufacture = yearofManufacture;

        for (int i = 0; i < wheels; i++) {
            this.wheels.add(new Wheel(diameters));
        }



    }

    public Car(int wheels, int diameters) {
    }

    public int getyearofManufacture() {
        return yearofManufacture;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setYearofManufacture(int yearofManufacture) {
        yearofManufacture = yearofManufacture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "la voiture est de couleur" + color +"d'annee" + yearofManufacture + "avec" + wheels + "roues de" + wheels.get(0).getDiameters() + "cm";
    }
}
