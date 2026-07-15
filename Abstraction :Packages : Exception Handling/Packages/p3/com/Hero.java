package com;

public class Hero extends Vehicle {

    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    public String getOwnerName() {
        return "Manikanta";
    }

    public int getSpeed() {
        return 70;
    }

    public void radio() {
        System.out.println("Radio is ON");
    }
}
