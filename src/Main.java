import transport.DriverB;
import transport.DriverC;
import transport.DriverD;
import transport.Car;
import transport.Bus;
import transport.Truck;
import transport.Transport;

public class Main {
    public static void main(String[] args) {
        Car car1 =new Car("Лада","Гранта",1.6f);
        Car car2 =new Car("Волга","Siber",2.6F);
        Car car3 =new Car("УАЗ","Патриот",3.6F);
        Car car4 =new Car("Ока","Гном",1.0F);

        Bus bus1=new Bus("ПАЗ","3205",1.2F);
        Bus bus2=new Bus("ИКАРУС","417И",1.6F);
        Bus bus3=new Bus("VOLGABUS","5270G",4.2F);
        Bus bus4=new Bus("ЛАЗ","5292",1.2F);

        Truck truck1=new Truck("КАМАЗ","Компас",3.2F);
        Truck truck2=new Truck("ГАЗ","НЕКСТ",2.7F);
        Truck truck3=new Truck("НЕФАЗ","4514",3.2F);
        Truck truck4=new Truck("Урал","4320",3.2F);

        DriverB alex= new DriverB("Алекс Шумахер", "В",10);
        DriverC mike=new DriverC("Михаил Петров","С",10);
        DriverD vova=new DriverD("Владимир Сайвор","D",10);

        car1.startMovement();
        System.out.println(alex.driverCar(car3));
        System.out.println(alex.driverTruck(truck1));
        System.out.println(mike.driverTruck(truck1));
        System.out.println(vova.driverBus(bus1));

    }
}