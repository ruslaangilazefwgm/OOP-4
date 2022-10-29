package transport;

import driver.DriverB;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    protected String mark;
    protected String model;
     protected double volume;
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Mechanicks> mechaniks = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();


    public Transport(String mark, String model, double volume) {
        if (mark != null && !mark.isEmpty()) {
            this.mark = mark;
        } else {
            this.mark = "incorrect";
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "incorrect";
        }
        if (Double.compare(volume,0) == 0) {
            this.volume = 1.5;
        } else {
            this.volume = volume;
        }

    }

    public void addDriver(Driver... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanicks(Mechanicks... mechanicks) {
        this.mechaniks.addAll(Arrays.asList(mechanicks));
    }
    public void addSponsors(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void toStart();

    public abstract void toFinish();

    @Override
    public String toString() {
        return "Transport{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ", Drivers=" + drivers +
                '}';
    }

    public  abstract boolean passDiagnostic();
    public abstract void printType();
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        if (mark != null && !mark.isEmpty()) {
            this.mark = mark;
        } else {
            this.mark = "incorrect";
        }
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "incorrect";
        }
    }
    public double getVolume() {
        return volume;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanicks> getMechaniks() {
        return mechaniks;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void repair();


}
