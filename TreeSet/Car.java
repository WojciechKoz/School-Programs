public class Car extends Vehicle{
    String type;

    Car(String color, String type, int number, float speed) {
        super(color, number, speed);

        this.type = type;
    }

    public String toString() {
        return color + " " + type + " with number " + number;
    }
}
