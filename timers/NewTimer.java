public class NewTimer {
    private int seconds;
    static int howMany = 0;

    NewTimer() {
        howMany++;
        System.out.print("make new Timer with ");
        seconds = 0;

        System.out.println(this);
    }

    NewTimer(int h, int m, int s) {
        howMany++;
        System.out.print("make new Timer with ");
        seconds = s + 60*m + 3600*h;

        setRightTime(converter());

        System.out.println(this);
    }

    private int [] converter() {
        int [] output = new int[3];

        output[0] = seconds / 3600;
        output[1] = (seconds-output[0]*3600)/60;
        output[2] = seconds - output[0]*3600 - output[1]*60;

        return output;
    }

    private int setRightTime(int[] time) {
        if(time[2] < 0) {
            time[1]--;
            time[2] += 60;
        }

        if(time[2] >= 60) {
            time[1]++;
            time[2] -= 60;
        }

        if(time[1] < 0) {
            time[0]--;
            time[1] += 60;
        }

        if(time[1] >= 60) {
            time[0]++;
            time[1] -= 60;
        }

        if(time[0] < 0) {
            time[0] += 24;
        }

        if(time[0] >= 24) {
            time[0] -= 24;
        }
        return time[0]*3600 + time[1]*60 + time[2];
    }

    public String toString() {
        int [] time = converter();

        return "time : " + time[0] + ":" + time[1] + ":" + time[2];
    }

    boolean equals(int h, int m, int s) {
        System.out.print(this + " is equal to " + h + ":" + m + ":" + s + " ? ");

        int [] time = converter();

        return (h == time[0] && m == time[1] && s == time[2]);
    }

    void hoursIncrement() {
        System.out.println("hours increment ...");

        seconds += 3600;

        seconds = setRightTime(converter());
    }



    void hoursDecrement() {
        System.out.println("hours decrement ...");

        seconds -= 3600;

        seconds = setRightTime(converter());
    }

    void secondsIncrement() {
        seconds += 1;

        seconds = setRightTime(converter());
    }

    void secondsIncrement(int n) {
        if(n >= 60) {
            System.out.println("zle dane");
            return;
        }

        System.out.println("seconds increment " + n + " times");

        while(n > 0) {
            secondsIncrement();
            n--;
        }
    }

    int compare(int h, int m, int s) {
          System.out.println(this + " compare with " + h + ":" + m + ":" + s);

        System.out.println("1 > , -1 <, 0 ==");

        int output;
        int [] time = converter();

        if(time[0] > h) {
            output = 1;
        } else if(time[0] < h) {
            output = -1;
        } else {
            if(time[1] > m) {
                output = 1;
            } else if(time[1] < m) {
                output = -1;
            } else {
                if(time[2] > s) {
                    output = 1;
                } else if(time[2] < s) {
                    output = -1;
                } else {
                    output = 0;
                }
            }

        }
        return output;
    }
}
