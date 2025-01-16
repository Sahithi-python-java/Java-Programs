package com.sahithi.Car;

import com.sahithi.Vehicles.Vehicles;

public abstract class Car implements Vehicles {
    @Override
    public String type() {
        return "Car";
    }

    // Abstract method to be implemented in subclasses
    public abstract int engine();
}
