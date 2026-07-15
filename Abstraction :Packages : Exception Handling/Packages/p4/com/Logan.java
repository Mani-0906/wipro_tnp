package com;

public class Logan extends Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP39EF1111";
    }

    public String getOwnerName() {
        return "Ravi";
    }

    public int speed() {
        return 110;
    }

    public void gps() {
        System.out.println("GPS is ON");
    }
}
