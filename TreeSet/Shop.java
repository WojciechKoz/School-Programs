import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Shop {
    private TreeSet<Vehicle> vehicles = new TreeSet<Vehicle>();

    Shop() {
        vehicles.add(new Bike("czerwony", "miejski", 1, 15));

        vehicles.add(new Bike("niebieski", "sportowy", 2, 30));

        vehicles.add(new Car("biały", "combi", 4, 140));
    }

    void printAll() {
        Iterator<Vehicle> iterator = vehicles.iterator();

        while(iterator.hasNext()) {
            Vehicle v = iterator.next();
            System.out.println(v.toString());
        }
        /*
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }*/
    }

    void addNew(String color, String type, int number, float speed) {
        vehicles.add(new Car(color, type, number, speed));
    }

    void speedTests() {
        for(Vehicle vehicle : vehicles) {
            Random gen = new Random();
            float distance = gen.nextFloat()*200 + 10;
            System.out.print("vehicle with speed " + vehicle.getSpeed() + "km/h , distance " + distance + '\n');
            System.out.println(vehicle.speedTest(distance) + " hours");
        }
    }

}
