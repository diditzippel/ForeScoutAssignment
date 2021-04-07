package com.models;

import java.text.DecimalFormat;

public class VehicleInstance<T extends Vehicle> {
    final T vehicle; // All vehicle props (color, doors, powerBy..) is constant
    double remainPower; // This value remainPower is change every single min/hr

    public VehicleInstance(T vehicle, double remainPower) {
        this.vehicle = vehicle;
        this.remainPower = remainPower;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.#");
        return vehicle.toString() + "\n" + df.format(remainPower) + "% remainPower";
    }
}
