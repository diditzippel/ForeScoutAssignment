import com.models.Vehicle;
import com.models.VehicleInstance;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class VehiclesMakerJob {
    private static final ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1);

    public static void start() {
        ScheduledFuture<?> schedule = executor.scheduleAtFixedRate(() -> {
            VehicleFactory factory = new VehicleFactory();
            VehicleInstance<Vehicle> vehicle = factory.getVehicle(RandomUtils.getRandomVehicleType());
            VehiclesStore.getInstance().addVehicle(vehicle);
        }, 0, 1, TimeUnit.SECONDS);

        executor.schedule(() -> schedule.cancel(false), 1, TimeUnit.MINUTES);
    }
}