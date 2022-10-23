package transport;

import java.time.LocalDate;

public class Car extends Transport {
    public static class Key {
        private boolean distEngine;
        private boolean unKey;

        public Key(boolean distEngine, boolean unKey) {
                this.distEngine = distEngine;
                this.unKey = unKey;
        }
        public Key() {
            this(false, false);
        }

        public boolean isDistEngine() {
            return distEngine;
        }

        public boolean isUnKey() {
            return unKey;
        }
    }
    public static class Insurance {
        private final LocalDate validityPeriod;
        private final int insCount;
        private final String insNumber;

        public Insurance(LocalDate validityPeriod, int insCount, String insNumber) {
            if (validityPeriod == null) {
                this.validityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriod = validityPeriod;
            }
            this.insCount = insCount;

            if (insNumber == null) {
                this.insNumber = "123456789";
            } else {
                this.insNumber = insNumber;
            }
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public int getInsCount() {
            return insCount;
        }

        public String getInsNumber() {
            return insNumber;
        }

        public void checkValidityPeriod() {
            if (validityPeriod.isBefore(LocalDate.now()) || validityPeriod.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }
        public void checkInsNumber() {
            if (insNumber.length() != 9 ) {
                System.out.println("incorrect");
            }
        }
    }
    double volume;
    String kpp;
    private String bodyType;
    String regNumber;
    private int sitCount;
    boolean summerTires;
    private Key key;
    private Insurance insurance;

    public Car(String mark, String model, int maxSpeed, double volume, String colour, int year, String country,
               String kpp, String fuelType, String bodyType, String regNumber, int sitCount, boolean summerTires, Key key,
               Insurance insurance) {
        super(mark, model, year, country, colour, maxSpeed, fuelType);
        if (Double.compare(volume,0) == 0) {
            this.volume = 1.5;
        } else {
            this.volume = volume;
        }
        if (kpp == null) {
            this.kpp = "incorrect";
        } else {
            this.kpp = kpp;
        }
        if (bodyType == null) {
            this.bodyType = "incorrect";
        } else {
            this.bodyType = bodyType;
        }
        if (regNumber == null || regNumber.length() != 9) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        if (sitCount < 0) {
            this.sitCount = Math.abs(sitCount);
        } else {
            this.sitCount = sitCount;
        }
        this.summerTires = summerTires;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        if (fuelType != "Бензин" || fuelType != "Дизель" || fuelType != "Электричество") {
            this.fuelType = "incorrect";
        } else {
            this.fuelType = fuelType;
        }
    }

    public void printAuto() {
        System.out.println(getMark()
                + " " + getModel() + ", " + getYear()
                + " года выпуска, максимальная скорость: " + getMaxSpeed() +", сборка: " + getCountry() + ", цвет: "
                + getColour() + ", объем двигателя:  " + getVolume()
                + ", коробка передач " + getKpp() + ", тип кузова " + getBodyType()
                + ", рег. номер: " + getRegNumber() + ", кол-во мест: " + getSitCount()
                + (changeTires() ? ", летняя " : ", зимняя ") + "резина, " + (getKey().isDistEngine() ? "удаленный запуск," : "обычный запуск,")
                + (getKey().isUnKey() ? " безключевой запуск," : " ключевой запуск")
                + ", номер страховки: " + getInsurance().getInsNumber() + ", стоимость страховки: " + getInsurance().insCount
                + ", срок действия страховки: " + getInsurance().validityPeriod
        );
    }
    public boolean changeTires() {
        summerTires = !summerTires;
        return false;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (Character.isAlphabetic(chars[0]) || Character.isAlphabetic(chars[4]) || Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6])
                && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    @Override
    public void refill() {
            System.out.println("Заправить машину: " + fuelType);
    }

    public double getVolume() {
        return volume;
    }
    public String getKpp() {
        return kpp;
    }
    public void setKpp(String kpp) {
        this.kpp = kpp;
    }
    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getSitCount() {
        return sitCount;
    }
    public void setSitCount(int sitCount) {
        this.sitCount = sitCount;
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public Insurance getInsurance() {
        return insurance;
    }
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}
