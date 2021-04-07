import com.models.VehicleType;

import java.awt.*;
import java.util.Random;

public class RandomUtils {
    private static final Random random = new Random();

    public static Color getRandomColor() {
        final int r = random.nextInt(256);
        final int g = random.nextInt(256);
        final int b = random.nextInt(256);

        return new Color(r, g, b);
    }

    public static int getRandomDoors(int min, int max) {
        final int gap = (max - min) + 1; // 4
        return random.nextInt(gap) + min;
        // 0, 1, 2, 3 + 2 => 2, 3, 4, 5
    }

    public static double getEnergy() {
        return random.nextDouble() * 100;
    }

    public static boolean hasCargo() {
        return random.nextInt(2) != 0;
    }

    public static VehicleType getRandomVehicleType() {
        VehicleType[] types = VehicleType.values();
        int index = random.nextInt(types.length);
        return types[index];
    }
}
