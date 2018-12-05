abstract class Vehicle implements Comparable<Vehicle>{
    String color;
    int number;
    float speed;

    Vehicle(String color, int number, float speed) {
        this.color = color;
        this.number = number;

        this.speed = speed;
    }

    public String toString() {
        return color + " with number" + number;
    }

    float speedTest(float distance) { // km
        return distance/speed; // in hours
    }

    float getSpeed() {
        return speed;
    }

    int getNum() {
        return number;
    }

    public int compareTo(Vehicle different) {
        if(different.getNum() > number)
            return 1;
        if(different.getNum() < number)
            return -1;
        return 0;
    }
}
