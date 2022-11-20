package transport;
public abstract class  Driver <T extends Transport> {
    private String fullName;
    private String category;
    public int drivingExperience;
    private T car = null;

    public Driver(String fullName, String category, int drivingExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public Driver(T car) {

        this.car = car;
    }

     public void startMovement() {
        System.out.printf("Driver %s started moving", this.fullName);
        this.car.startMovement();
    }

    public void stopMovement() {
        System.out.printf("Driver %s stopped moving", this.fullName);
        this.car.stopMovement();
    }

    public void refill() {
        System.out.printf("Driver %s refilling the %s",
                this.fullName,
                this.car.getBrand(),
                this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public String toString() {
        return String.format("Водитель %s управлять автомобилем и будет участвовать в заезде");
    }
}

