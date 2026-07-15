package com;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "AP39GH2222";
    }

    public String getOwnerName() {
        return "Kiran";
    }

    public int speed() {
        return 130;
    }

    public void tempControl() {
        System.out.println("Air Conditioner is ON");
    }
}
