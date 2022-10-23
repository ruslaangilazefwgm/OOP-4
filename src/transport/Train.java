package transport;
public class Train extends Transport {
    protected int tripPrice;
    protected int tripTime;
    protected String departStation;
    protected String arriveStantion;
    protected int vagonCount;

    public Train(String mark, String model, int year, String country, String colour, int maxSpeed, String fuelType,
                 int tripPrice, int tripTime, String departStation, String arriveStantion, int vagonCount){
        super(mark, model, year, country, colour, maxSpeed, fuelType);
        if (tripPrice < 0) {
            this.tripPrice = Math.abs(tripPrice);
        } else {
            this.tripPrice = tripPrice;
        }
        if (tripTime < 0) {
            this.tripTime = Math.abs(tripTime);
        } else {
            this.tripTime = tripTime;
        }
        if (departStation != null && !departStation.isEmpty()) {
            this.departStation = departStation;
        } else {
            this.departStation = "incorrect";
        }
        if (arriveStantion != null && !arriveStantion.isEmpty()) {
            this.arriveStantion = arriveStantion;
        } else {
            this.arriveStantion = "incorrect";
        }
        if (vagonCount < 0) {
            this.vagonCount = Math.abs(vagonCount);
        } else {
            this.vagonCount = vagonCount;
        }
        if (fuelType != "Дизель" ) {
            this.fuelType = "incorrect";
        } else {
            this.fuelType = fuelType;
        }
    }
    public void printTrain() {
        System.out.println(getMark() + " " + getModel()
                + ", год выпуска: " + getYear() +
                ", скорость: " + getMaxSpeed() +
                " км/ч, отходит от: " + getDepartStation() +
                ", следует до: " + getArriveStantion() +
                ", цена поездки: " + getTripPrice() +
                " рублей, вагонов: " + getVagonCount()
        );
    }

    @Override
    public void refill() {
        if (fuelType == "Дизель") {
            System.out.println("Заправить " + fuelType);
        } else {
            System.out.println("Топливо не подходит");
        }
    }

    public int getTripPrice() {
        return tripPrice;
    }
    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }
    public int getTripTime() {
        return tripTime;
    }
    public void setTripTime(int tripTime) {
        this.tripTime = tripTime;
    }
    public String getDepartStation() {
        return departStation;
    }
    public void setDepartStation(String departStation) {
        this.departStation = departStation;
    }
    public String getArriveStantion() {
        return arriveStantion;
    }
    public void setArriveStantion(String arriveStantion) {
        this.arriveStantion = arriveStantion;
    }
    public int getVagonCount() {
        return vagonCount;
    }
    public void setVagonCount(int vagonCount) {
        this.vagonCount = vagonCount;
    }
}
