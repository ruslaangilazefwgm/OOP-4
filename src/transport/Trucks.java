package transport;

public class Trucks extends Transport implements Competing{
    public enum LoadCapacity {
        N1(0.0, 3.5), N2(3.5, 12.0), N3(12.0, null);
        private Double from;
        private Double to;

        LoadCapacity(Double from, Double to) {
            this.from = from;
            this.to = to;
        }
    }
    private LoadCapacity loadCapacity;
    public Trucks(String mark, String model, double volume, LoadCapacity loadCapacity) {
        super(mark, model, volume);
        this.loadCapacity = loadCapacity;
    }
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по авто не достаточно");
        } else {
            String from = loadCapacity.from == null ? "" : "от " + loadCapacity.from;
            String to = loadCapacity.to == null ? "" : "до " + loadCapacity.to;
            System.out.println("Грузоподъемность авто: " + from + to);
        }
    }

    @Override
    public void toStart() {
        System.out.println("Включить зажигание, массу, выбрать передачу, начать движение");
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
        return 50;
    }

    @Override
    public double maxSpeed() {
        return 100;
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ", loadCapacity=" + loadCapacity +
                '}';
    }

    @Override
    public boolean passDiagnostic() {
        return Math.random() > 0.75;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
