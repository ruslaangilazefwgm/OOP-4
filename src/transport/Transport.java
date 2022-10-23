package transport;

public abstract class Transport {
    protected String mark;
    protected String model;
     protected double volume;

    public Transport(String mark, String model, double volume ) {
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

    public abstract void toStart();

    public abstract void toFinish();

    @Override
    public String toString() {
        return "Transport{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }

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
}
