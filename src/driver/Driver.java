package driver;

import transport.Transport;

public  class Driver<T extends Transport> {
    private  String name;
    private   String driverLicense;
    private   int experience;
//    private  T car;


    public Driver(String name, String driverLicense, int experience, T car) {
        this.name = name;
        if (driverLicense.matches("^[b-dB-D]+$") && !driverLicense.isEmpty()) {
            this.driverLicense = driverLicense;
        } else {
            throw new RuntimeException("необходимо указать тип прав!");
        }
        this.experience = experience;
//        this.car = car;
        setDriverLicense(driverLicense);

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



    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

//    @Override
//    public String toString() {
//        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
//                this.name,
//                this.car.getMark(),
//                this.car.getModel());
//
//    }
}
