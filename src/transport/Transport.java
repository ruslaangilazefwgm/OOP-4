package transport;

public abstract class Transport {
    protected String mark;
    protected String model;
    protected int year;
    protected String country;
    protected String colour;
    protected int maxSpeed;
    protected  String fuelType;

    public Transport(String mark, String model, int year, String country, String colour, int maxSpeed, String fuelType) {
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
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "Incorrect";
        } else {
            this.country = country;
        }
        if (colour != null && !colour.isEmpty()) {
            this.colour = colour;
        } else {
            this.colour = "incorrect";
        }
        if (maxSpeed == 0) {
            this.maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
        if (fuelType != null && !fuelType.isEmpty()) {
            this.fuelType = fuelType;
        } else {
            this.fuelType = "incorrect";
        }
    }

    public void printTransport() {
        System.out.println("Марка: " + getMark() +
                ", модель: " + getModel() +
                ", год: " + getYear() +
                ", страна: " + getCountry() +
                ", цвет: " + getColour() +
                ", скорость: " + getMaxSpeed() + " км/ч.");
    }

    public abstract void refill();
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
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        if (colour != null && !colour.isEmpty()) {
            this.colour = colour;
        } else {
            this.colour = "incorrect";
        }
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
