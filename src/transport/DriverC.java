package transport;
public class DriverC extends Driver<Truck> {
    public DriverC (String fullName, int drivingExperience, Truck car) {
        super(fullName, category:"C", drivingExperience, car);
    }
}