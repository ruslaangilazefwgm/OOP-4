import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car(
                "Lada", "Granta",
                0, 1.7,
                "Yellow", 2015,
                "Russia", null, null,
                null, null,
                10, false,
                null, null
        );
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro", 0,
                3.0, "black",
                2020, "German",
                null, null,
                null, null ,0,
                false, null,
                null);
        Car bmw = new Car("BMW", "Z8",
                0,3.0,
                "Black", 2021,
                "German",null,
                null, null ,null,
                0, false,
                null, null);
        Car kia = new Car("Kia", "Sportage 4th legacy",
                0,2.4,
                "Red", 2018,
                "South Korea", null, null,
                null, null, 0,
                false, null,
                null);
        Car honde = new Car("Hyundai", "Avante",
                0,1.6,
                "Orange", 2016,
                "South Korea", null,
                null, null,
                null,0, false,
                null, null);

        granta.printAuto();
        audi.printAuto();
        bmw.printAuto();
        kia.printAuto();
        honde.printAuto();
        System.out.println();

        Train lastochka = new Train("Ласточка", "В-901",
                2011, "Россия",
                null, 301, null,
                3500, 0,
                "Белорусский вокзал", "Минск-пасс",
                11);
        Train leningrad = new Train("Ленинград", "D-125",
                2019, "Россия",
                null, 270, null,
                1700, 0,
                "Ленинградский вокзал", "Ленинград-пасс",
                8);

        lastochka.printTrain();
        leningrad.printTrain();
        System.out.println();

        Bus pazik = new Bus("Пазик", "Пазик",
                1950, "Россия",
                "Желтый", 90, null);
        Bus nefaz = new Bus("Нефаз", "Нефаз",
                2000, "Россия",
                "Красный", 90, null);
        Bus gazel = new Bus("Газель", "Газель",
                2010, "Россия",
                "белый", 190, "Бензин");
        pazik.printTransport();
        nefaz.printTransport();
        gazel.printTransport();
        gazel.refill();


    }
}