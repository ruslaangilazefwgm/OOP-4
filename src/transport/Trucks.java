package transport;

public class Trucks extends Transport implements Competing{

    public Trucks(String mark, String model, double volume) {
        super(mark, model, volume);
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
                '}';
    }
}
