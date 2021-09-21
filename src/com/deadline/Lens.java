package com.deadline;

public class Lens {
    private String brand;
    private String focalLength;
    boolean isPrime;

    Lens() {
        this.brand = "";
        this.focalLength ="";
        this.isPrime = false;
    }

    Lens(String brand, String focalLength, boolean isPrime) {
        this.brand = brand;
        this.focalLength = focalLength;
        this.isPrime = isPrime;
    }

    public void printDetails() {
        System.out.println(this.brand+", "+this.focalLength+", "+this.isPrime);
    }
}
