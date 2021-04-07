import com.models.VehicleInstance;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class VehiclesStore {
    public static final String VEHICLES = "Vehicles";

    private static VehiclesStore instance = new VehiclesStore();
    private final List<VehicleInstance<?>> vehicles;
    private List<PropertyChangeListener> listeners;

    public static VehiclesStore getInstance() {
        if (instance == null) {
            instance = new VehiclesStore();
        }
        return instance;
    }

    private VehiclesStore() {
        vehicles = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    public void addVehicle(VehicleInstance<?> vehicle) {
        vehicles.add(vehicle);

        for (PropertyChangeListener listener : listeners) {
            listener.propertyChange(new PropertyChangeEvent(this, VEHICLES, vehicles.size() - 1, vehicle));
        }
    }

    public void addChangeListener(VehiclesStoreObserver observer) {
        listeners.add(observer);
    }

    public void removeChangeListener(VehiclesStoreObserver observer) {
        listeners.remove(observer);
    }
}
