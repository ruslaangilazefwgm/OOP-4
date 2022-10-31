package transport;

public class Sponsor {
    private String name;
    private int summ;

    public Sponsor(String name, int summ) {
        this.name = name;
        this.summ = summ;
    }

    public void toSponsorRace() {
        System.out.printf("спонсор %s Спонсировал заезд на %d%n", name, summ);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }
}
