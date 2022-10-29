import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car(
                "Lada", "Granta",
                1.7, Car.BodyType.SEDAN);
        granta.addDriver(new DriverB("voloda", "B", 10, granta));

        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0, Car.BodyType.CROSSOVER);
        Car bmw = new Car("BMW", "Z8",
                3.0, Car.BodyType.KYPE);
        Car kia = new Car("Kia", "Sportage 4th legacy",
                2.4, Car.BodyType.PIKUP);

        Bus pazik = new Bus("Пазик", "Пазик",
                1950, Bus.Capacity.VERYSMALL);
        pazik.addDriver(new DriverD("Alex", "D", 13, pazik));
        Bus nefaz = new Bus("Нефаз", "Нефаз",
                2000, Bus.Capacity.SMALL);
        Bus gazel = new Bus("Газель", "Газель",
                2010, Bus.Capacity.BIG);
        Bus honde = new Bus("Hyundai", "Avante",
                1.6, Bus.Capacity.VERYBIG);

        Trucks iveco = new Trucks("Iveco", "truck",
                2.4, Trucks.LoadCapacity.N2);
        iveco.addDriver(new DriverC("Nick", "C", 10, iveco));
        Trucks man = new Trucks("man", "truck",
                2.4, Trucks.LoadCapacity.N1);
        Trucks volvo = new Trucks("volvo", "truck",
                2.4, Trucks.LoadCapacity.N3);
        Trucks renault = new Trucks("renault", "truck",
                2.4, Trucks.LoadCapacity.N2);

        DriverB voloda = new DriverB("Voloda", "B", 30, granta);
        DriverB lev = new DriverB("Lev", "B", 20, audi);
        DriverC nick = new DriverC("Nick", "C", 10, iveco);
        DriverC stepan = new DriverC("Stepan", "C", 23, man);
        DriverD alex = new DriverD("Alex", "D", 13, pazik);
        DriverD dan = new DriverD("Dan", "D", 16, gazel);


        Sponsor lena = new Sponsor("Лена", 300_000);
        Sponsor kanon = new Sponsor("kanon", 600_000);
        Sponsor beer = new Sponsor("Beer", 500_000);

        Mechanicks<Transport> zev = new Mechanicks<>("Zev", "Zevich", "MotorSport");
        Mechanicks<Transport> osiq = new Mechanicks<>("Osiq", "Osiqich", "MotorSport");
        Mechanicks<Transport> gab = new Mechanicks<>("Gab", "Gabich", "MotorSport");

        granta.addMechanicks(zev);
        granta.addSponsors(lena);



        pazik.addMechanicks(osiq);
        pazik.addSponsors(kanon);

        iveco.addMechanicks(gab);
        iveco.addSponsors(beer);


        List<Transport> allCars = List.of(
                granta, audi, bmw, kia, pazik,
                nefaz, gazel, honde, iveco, man,
                volvo, renault
        );

        for (Transport transport : allCars) {
            printInfo(transport);
        }

    }

    public static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getMark() + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: ");
        for (Sponsor sponsors : transport.getSponsors()) {
            System.out.println(sponsors.getName());
        }
        System.out.println("Механики: ");
        for (Mechanicks mechanicks : transport.getMechaniks()) {
            System.out.println(mechanicks.getName());
        }
        System.out.println();
    }

    public static void service(Transport... transports) {
        for (Transport transport : transports) {
            if (!transport.passDiagnostic()) {
                try {
                    throw new RuntimeException("Автомобиль " + transport.getMark() + " не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }


}
