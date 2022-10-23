package transport;

public class Trucks extends Transport{
    public Trucks(String mark, String model, int year, String country, String colour, int maxSpeed, String fuelType) {
        super(mark, model, year, country, colour, maxSpeed, fuelType);
    }

    @Override
    public void refill() {

    }
}
