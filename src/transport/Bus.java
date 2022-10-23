package transport;
public class Bus extends Transport {
    public Bus(String mark, String model, int year, String country, String colour, int maxSpeed, String fuelType) {
        super(mark, model, year, country, colour, maxSpeed, fuelType);
        if (fuelType == "Бензин" || fuelType == "Дизель") {
            this.fuelType = fuelType;
        } else {
            this.fuelType = "incorrect";
        }
    }
    public void refill() {
        if (fuelType == "Дизель" || fuelType == "Бензин") {
            System.out.println("Заправить " + fuelType);
        } else {
            System.out.println("Топливо не подходит");
        }
    }
}
