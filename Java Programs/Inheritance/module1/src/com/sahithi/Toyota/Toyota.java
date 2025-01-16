package com.sahithi.Toyota;

import com.sahithi.Car.Car;

public class Toyota extends Car {
    @Override
    public int engine() {
        return 4; // Example engine type
    }

    @Override
    public int tyres() {
        return 4; // Most cars have 4 tyres
    }
}
