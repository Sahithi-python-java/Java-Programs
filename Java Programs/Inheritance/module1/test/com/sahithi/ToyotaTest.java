package com.sahithi;

import com.sahithi.Toyota.Toyota;



public class ToyotaTest {
    public static void main(String[] args) {
        Toyota myToyota = new Toyota();

        System.out.println("Vehicle Type: " + myToyota.type());       // Output: Car
        System.out.println("Engine Cylinders: " + myToyota.engine()); // Output: 4
        System.out.println("Number of Tyres: " + myToyota.tyres());   // Output: 4
    }
}
