import com.models.VehicleInstance;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class VehiclesStoreObserver implements PropertyChangeListener {
    public VehiclesStoreObserver() {
        VehiclesStore.getInstance().addChangeListener(this);
    }

    public void release() {
        VehiclesStore.getInstance().removeChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        final Object newValue = evt.getNewValue();
        if (newValue instanceof VehicleInstance) {
            System.out.println(newValue);
        }
    }
}
