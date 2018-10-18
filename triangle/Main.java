public class Main {

    private static void makeATriangle(double a, double b, double c) {
        System.out.println(a + " " + " " + b + " " + c);

        if(Triangle.isPossible(a, b, c)){
            Triangle t = new Triangle(a, b, c);

            t.type();

            System.out.println("pole : " + t.pole());

            System.out.println("obwod : " + t.obwod());

            t.angleType();
        } else {
            System.out.println("nie da sie stworzyc");
        }

        System.out.println();
    }

    public static void main(String [] args) {
        double a = 10, b = 10, c = 10;

        makeATriangle(a, b, c);

        a = 20;
        b = 11;

        makeATriangle(a, b, c);

        a = 3;
        b = 4;
        c = 5;

        makeATriangle(a, b, c);

        a = 100;
        b = 10;

        makeATriangle(a, b, c);
    }
}
