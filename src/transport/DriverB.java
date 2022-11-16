package transport;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName, int drivingExperience, Car car) {
        super(fullName, category:"В", drivingExperience, Car);
    }
}
