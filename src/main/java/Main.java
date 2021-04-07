public class Main {
    public static void main(String []args) {
        VehiclesStoreObserver observer = new VehiclesStoreObserver();
        VehiclesMakerJob.start();
        // observer.release();
    }
}