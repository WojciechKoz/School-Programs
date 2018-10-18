class Triangle {
    private double a, b, c;

    static boolean isPossible(double sampleA, double sampleB, double sampleC) {
        return (sampleA + sampleB > sampleC && sampleA + sampleC > sampleB && sampleB + sampleC > sampleA);
    }

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void type() {
        if(a == b && b == c) {
            System.out.println("rownoboczny");
        } else if(a == b || b == c || a == c) {
            System.out.println("rownoramienny");
        } else {
            System.out.println("roznoboczny");
        }
    }

    void angleType() {
        if(c*c == b*b + a*a || b*b == a*a + c*c || a*a == b*b + c*c) {
            System.out.println("prostokatny");
        } else if(c >= a && c >= b && c*c < b*b + a*a) {
            System.out.println("ostrokatny");
        } else if(b >= a && b >= c && b*b < c*c + a*a) {
            System.out.println("ostrokatny");
        } else if(a*a < b*b + c*c) {
            System.out.println("ostrokatny");
        } else {
            System.out.println("rozwartokatny");
        }
    }

            // TODO check english name and refactor it
    double pole() {
        double p = (a + b + c) / 2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    double obwod() {
        return a + b + c;
    }
}
