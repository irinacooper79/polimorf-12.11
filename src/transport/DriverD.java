package transport;
public class DriverD extends Driver<Bus> {
    private static final Bus car = null;

    public DriverD(String fullName, int drivingExperience, Bus car) {
        super(fullName, "D", drivingExperience, car);
    }

    public DriverD(String владимир_сайвор, String d, int i) {
        super(владимир_сайвор, d, i, car);
    }

    public boolean driverBus(Bus bus1) {
        return false;
    }
}
