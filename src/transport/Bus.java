package transport;
public class Bus extends Transport implements Competing {

    public Bus(String mark, String model, double volume) {
        super(mark, model, volume);
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
                '}';
    }
}
