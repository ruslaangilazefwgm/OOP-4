package transport;

import transport.Car;
import transport.Transport;

import java.util.List;

public class Mechanicks<T extends Transport> {
    private String name;
    private String surname;
    private String company;

    public Mechanicks(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean service(T t) {
        return t.passDiagnostic();
    }

    public void repair(T t) {
        t.repair();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }
}
