package transport;
public class DriverC extends Driver<Truck> {
    private static final Truck car =null;

    public DriverC (int fullName, int drivingExperience, Truck car) {
        super(String.valueOf(fullName), "C", drivingExperience, car);
    }

    public DriverC(String михаил_петров, String с, int i) {
        super(car);

    }

    public boolean driverTruck(Truck truck1) {
        return false;
    }
}