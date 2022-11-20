package transport;

public class DriverB extends Driver<Car> {

    private static final Car car = null;

    public DriverB(String fullName, int drivingExperience, Car car) {
        super(fullName, "В", drivingExperience, car);
    }

    public DriverB(String алекс_шумахер, String в, int i) {
        super(car);

    }

    public boolean driverTruck(Truck truck1) {
        return false;
    }

    public boolean driverCar(Car car3) {
        return false;
    }
}
