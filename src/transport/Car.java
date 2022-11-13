package transport;

public class Car extends Transport implements Competing {
    public Car (String brand, String model, float engineVolume) {
        super (brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Автомобиль %s %s начинает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Автомобиль %s %s заканчивает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s на пит-стопе",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void getBestLapTime() {
        System.out.printf("Лучшее время авто %s %s - 6 минут 12 секунд",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void getMaxSpeed() {
        System.out.printf("Максимальная скорость авто %s %s - 220 км/ч",
                this.getBrand(),
                this.getModel());
    }
}