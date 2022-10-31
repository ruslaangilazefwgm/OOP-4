package driver;

import transport.Trucks;

public class DriverC extends Driver<Trucks> {
    public DriverC(String name, String driverLicense, int experience, Trucks car) {
        super(name, driverLicense, experience, car);
    }

}
