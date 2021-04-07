package com.models;

import java.awt.*;


public abstract class Vehicle {
    final int wheels;
    final Color color;
    final Object powerBy;

    public Vehicle(int wheels, Color color, Object powerBy) {
        this.wheels = wheels;
        this.color = color;
        this.powerBy = powerBy;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\n" +
                wheels + " wheels\n" +
                "Color: (R " + color.getRed() + ", G " + color.getGreen() + ", B " + color.getBlue() + ")\n" +
                "PowerBy = " + powerBy;
    }
}
