package transport;

import driver.DriverB;

import java.sql.Driver;
import java.util.*;

public abstract class Transport {
    protected String mark;
    protected String model;
     protected double volume;
    private final Set<Driver> drivers = new HashSet<>();
    private final Set<Mechanicks> mechaniks = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();


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

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Set<Mechanicks> getMechaniks() {
        return mechaniks;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void repair();


}
