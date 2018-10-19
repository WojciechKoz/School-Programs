public class Main {

    private static int nwd(int a, int b) {
        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    private static int nwd2(int a, int b) {
        while(a != 0) {
            int c = a;
            a = b % a;
            b = c;
        }
        return b;
    }

    public static void main(String [] args) {
        System.out.println(nwd(12, 28));
        System.out.println(nwd2(12, 28));
    }
}
