public class Bike extends Vehicle {
    String type;

    Bike(String color, String name, int number, float speed) {
        super(color, number, speed);

        this.type = name;
    }

    public String toString() {
        return color + " " + type + " with number " + number;
    }


}
