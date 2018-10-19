public class Main {

    private static boolean isPrime(int number){
        System.out.print("number " + number + " - ");
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void primes(int a, int b) {
        for(int i = a; i <= b; i++) {
            System.out.println(isPrime(i));
        }
    }

    public static void main(String [] args) {
        primes(10, 100);
    }
}
