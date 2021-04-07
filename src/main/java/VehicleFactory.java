import com.models.Vehicle;
import com.models.VehicleInstance;
import com.models.VehicleType;
import com.models.Vehicles;

import java.awt.*;

public class VehicleFactory {
    public <T extends Vehicle> VehicleInstance<T> getVehicle(VehicleType type) {
        Color color = RandomUtils.getRandomColor();
        Vehicle vehicle = null;
        switch (type) {
            case Car: {
                vehicle = new Vehicles.Car(RandomUtils.getRandomDoors(2, 5), color);
                break;
            }
            case ElectricCar: {
                vehicle = new Vehicles.ElectricCar(RandomUtils.getRandomDoors(2, 5), color);
                break;
            }
            case Motocyle: {
                vehicle = new Vehicles.Motocyle(color);
                break;
            }
            case ElectricMotocyle: {
                vehicle = new Vehicles.ElectricMotocyle(color);
                break;
            }
            case Truck: {
                vehicle = new Vehicles.Truck(RandomUtils.hasCargo(), color);
                break;
            }
        }

        return new VehicleInstance(vehicle, RandomUtils.getEnergy());
    }
}