package transport;

import driver.DriverD;

public class Bus extends Transport implements Competing {
    public void addDriver(DriverD driverD) {
    }

    public enum Capacity {
        VERYSMALL(0,10), SMALL(10,25), MEDIUM(40,50), BIG(60,80), VERYBIG(100,120);
        private int from;
        private int to;

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
    private Capacity capacity;
    public Bus(String mark, String model, double volume, Capacity capacity) {
        super(mark, model, volume);
        this.capacity = capacity;
    }
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто не достаточно");
        } else {
            System.out.println("Вместимость авто: от " + capacity.from + " до " + capacity.to);
        }
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getMark() + " починена");
    }

    @Override
    public void toStart() {
        System.out.println("Закрыть двери, включить передачу, нажать газ");
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
        return 60;
    }

    @Override
    public double maxSpeed() {
        return 100;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ", capacity= " + capacity +
                '}';
    }

    @Override
    public boolean passDiagnostic() {
        System.out.println(getMark() + "автобус в диагностике не нуждается");
        return true;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
