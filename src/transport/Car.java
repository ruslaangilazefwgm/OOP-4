package transport;

import java.time.LocalDate;

public class Car extends Transport implements Competing {

    public Car(String mark, String model, double volume) {
        super(mark, model, volume);
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
                '}';
    }
}
