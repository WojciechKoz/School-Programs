
public class Main {

    private static void myTimerTests() {
        MyTimer t1 = new MyTimer(1, 30, 0);

        System.out.println(t1);

        System.out.println(t1.equals(2, 0, 0));

        t1.hoursIncrement();

        System.out.println(t1);

        MyTimer t2 = new MyTimer(0, 30, 0);

        t2.hoursDecrement();

        System.out.println(t2);

        MyTimer t3 = new MyTimer();

        System.out.println("seconds increment");

        t3.secondsIncrement();

        System.out.println(t3);

        MyTimer t4 = new MyTimer(23, 59, 30);

        t4.secondsIncrement(50);

        System.out.println(t4);

        MyTimer t5 = new MyTimer(5, 5, 5);

        System.out.println(t5.compare(7, 10, 20));

        System.out.println("how many timers we have created? " + MyTimer.createdTimers);
    }

    private static void newTimerTests() {
        NewTimer t1 = new NewTimer(23, 30, 0);

        System.out.println(t1);

        System.out.println(t1.equals(2, 0, 0));

        t1.hoursIncrement();

        System.out.println(t1);

        NewTimer t2 = new NewTimer(-1, 30, 0);

        t2.hoursDecrement();

        System.out.println(t2);

        NewTimer t3 = new NewTimer();

        System.out.println("seconds increment");

        t3.secondsIncrement();

        System.out.println(t3);

        NewTimer t4 = new NewTimer(23, 59, 30);

        t4.secondsIncrement(50);

        System.out.println(t4);

        NewTimer t5 = new NewTimer(5, 5, 5);

        System.out.println(t5.compare(7, 10, 20));

        System.out.println("how many (new)timers we have created? " + NewTimer.createdTimers);
    }

    public static void main(String [] args) {
        myTimerTests();

        int i = 3;
        while(i-- > 0)
            System.out.println();

        newTimerTests();
    }
}
