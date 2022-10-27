import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Trucks;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car(
                "Lada", "Granta",
                 1.7, Car.BodyType.SEDAN);
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0, Car.BodyType.CROSSOVER);
        Car bmw = new Car("BMW", "Z8",
                3.0, Car.BodyType.KYPE);
        Car kia = new Car("Kia", "Sportage 4th legacy",
                 2.4, Car.BodyType.PIKUP);
//        System.out.println(granta);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println();

        Bus pazik = new Bus("Пазик", "Пазик",
                1950, Bus.Capacity.VERYSMALL );
        Bus nefaz = new Bus("Нефаз", "Нефаз",
                2000, Bus.Capacity.SMALL);
        Bus gazel = new Bus("Газель", "Газель",
                2010, Bus.Capacity.BIG);
        Bus honde = new Bus ("Hyundai", "Avante",
                1.6, Bus.Capacity.VERYBIG);
//        System.out.println(pazik);
//        System.out.println(nefaz);
//        System.out.println(gazel);
//        System.out.println(honde);
//        System.out.println();

       Trucks iveco = new Trucks("Iveco", "truck",
                2.4, Trucks.LoadCapacity.N2);
       Trucks man = new Trucks("man", "truck",
                2.4, Trucks.LoadCapacity.N1);
        Trucks volvo = new Trucks("volvo", "truck",
                2.4, Trucks.LoadCapacity.N3);
        Trucks renault = new Trucks("renault", "truck",
                2.4, Trucks.LoadCapacity.N2);
//        System.out.println(iveco);
//        System.out.println(man);
//        System.out.println(volvo);
//        System.out.println(renault);

        DriverB voloda = new DriverB("Voloda", "B", 30, granta);
//        System.out.println(voloda);
//        pazik.printType();
        service(kia, honde, granta, man, bmw, iveco);

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