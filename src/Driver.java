import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String name;
    private  final String driverLicense;
    private  final int experience;
    private final T car;


    public Driver(String name, String driverLicense, int experience, T car) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;
        this.car = car;
    }
    public void startDriving() {
        System.out.println("Поехали");
    }

    public void stopDriving() {
        System.out.println("Остановиться");
    }

    public void refill() {
        System.out.println("Заправиться");
    }

    public String getName() {
        return name;
    }



    public String driverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                this.name,
                this.car.getMark(),
                this.car.getModel());

    }
}
