public class Main {

    private static void equation(double a, double b, double c){
        System.out.println("rozwiazanie rownania dla parametrow : a = " + a + ", b = " + b + ", c = " + c);

        if(a == 0) {
            if(b == 0) {
                if(c == 0){
                    System.out.println("tozsamosc");
                } else {
                    System.out.println("sprzeczne");
                }
            } else {
                double x = -c/b;

                System.out.println("x = " + x);
            }
        } else {
            double delta = b*b - 4*a*c;

            if(delta < 0){
                System.out.println("sprzeczne");
            } else {
                delta = Math.sqrt(delta);

                double x1 = (-b - delta)/(2*a);

                double x2 = (-b + delta)/(2*a);

                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

    public static void main(String [] args) {
        equation(1, 2, 3);
        equation(2, 2, -12);
        equation(2, -16, 32);
        equation(0, 4, 2);
        equation(0, 0, 2);
        equation(0, 0, 0);

    }
}
