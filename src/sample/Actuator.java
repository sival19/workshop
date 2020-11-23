package com.company;

/*
 * This class is responsible for keeping
 * track of the Actuators
 */

public class Actuator extends Unit{
    private double value;

    public Actuator(String name, double value) {
        super(name);
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
