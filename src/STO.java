import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Trucks;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class STO<T extends Transport> {
    private Queue<Transport> autoQueue = new LinkedList<>();

    private void addTransport(Transport transport) {
        autoQueue.offer(transport);
    }

    public void addCar(Car car) {
        addTransport(car);
    }
    public void addTruck(Trucks trucks) {
        addTransport(trucks);
    }

    public void toSTO() {
        System.out.println("Прохoждение ТО");
    }
}
