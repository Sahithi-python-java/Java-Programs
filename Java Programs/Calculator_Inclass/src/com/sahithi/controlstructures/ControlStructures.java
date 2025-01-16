package com.sahithi.controlstructures;

public class ControlStructures {
    public String determineCategory(int age){
        if (age <= 10) {
            return "child";
        } else if (age > 10 && age <= 20) {
            return "teenager";
        } else {
            return "adult";
        }
    }
}
