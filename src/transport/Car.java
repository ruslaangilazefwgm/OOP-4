package transport;

import driver.Driver;
import driver.DriverB;

public class Car extends Transport implements Competing {


    public enum BodyType {
        SEDAN, HETCHBACK,
        KYPE, UNIVERSAL,
        UNROAD, CROSSOVER,
        PIKUP, FURGON,
        MINIVAN
    }
private BodyType bodyType;
    public Car(String mark, String model, double volume, BodyType bodyType) {
        super(mark, model, volume);
        this.bodyType = bodyType;

    }

    public void addDriverB(DriverB driverB) {
        addDriver();
    }

    @Override
    public void toStart() {
        System.out.println("Включить зажигание, выбрать передачу, нажать газ");
    }

    @Override
    public void toFinish() {
        System.out.println("Тормоз. Выключить передачу, зажигание.");

    }

    @Override
    public void pitStop() {
        System.out.println("Остановиться на пит-стоп");
    }

    @Override
    public double betterTime() {
        return 25;
    }

    @Override
    public double maxSpeed() {
        return 150;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ", bodyType=" + bodyType +
                '}';
    }

    @Override
    public boolean passDiagnostic() {
        return Math.random() > 0.7;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по авто не достаточно");
        } else {
            System.out.println("Тип авто: " +bodyType);
        }
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getMark() + " починена");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
