package com.models;

import java.awt.*;

public class Vehicles {
    private static abstract class BaseCar extends Vehicle {
        final int doors;

        public BaseCar(int doors, Color color, PowerSource powerBy) {
            super(4, color, powerBy);
            this.doors = doors;
        }
    }

    public static class Car extends BaseCar {
        public Car(int doors, Color color) {
            super(doors, color, PowerSource.Gasoline);
        }
    }

    public static class ElectricCar extends BaseCar {
        public ElectricCar(int doors, Color color) {
            super(doors, color, PowerSource.Electricity);
        }
    }

    abstract private static class BaseMotocyle extends Vehicle {
        public BaseMotocyle(Color color, PowerSource powerBy) {
            super(2, color, powerBy);
        }
    }

    public static class Motocyle extends BaseMotocyle {
        public Motocyle(Color color) {
            super(color, PowerSource.Gasoline);
        }
    }

    public static class ElectricMotocyle extends BaseMotocyle {
        public ElectricMotocyle(Color color) {
            super(color, PowerSource.Electricity);
        }
    }

    public static class Truck extends Vehicle {
        final boolean cargoAttached;

        public Truck(boolean cargoAttached, Color color) {
            super(18, color, PowerSource.Diesel);
            this.cargoAttached = cargoAttached;
        }
    }
}
