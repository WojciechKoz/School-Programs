public class MyTimer {
    private int hours, minutes, seconds;
    static int howMany = 0;

    MyTimer() {
        howMany++;
        System.out.print("make new Timer with ");

        hours = 0;
        minutes = 0;
        seconds = 0;

        System.out.println(this);
    }

    MyTimer(int h, int m, int s) {
        howMany++;
        System.out.print("make new Timer with");

        hours = h;
        minutes = m;
        seconds = s;

        setRightTime();

        System.out.println(this);
    }

    private void setRightTime() {
        if(seconds < 0) {
            minutes--;
            seconds += 60;
        }

        if(seconds >= 60) {
            minutes++;
            seconds -= 60;
        }

        if(minutes < 0) {
            hours--;
            minutes += 60;
        }

        if(minutes >= 60) {
            hours++;
            minutes -= 60;
        }

        if(hours < 0) {
            hours += 24;
        }

        if(hours >= 24) {
            hours -= 24;
        }
    }

    public String toString() {
        return "time : " + String.valueOf(hours) + ":" + String.valueOf(minutes) + ":" + String.valueOf(seconds);
    }

    boolean equals(int h, int m, int s) {
        System.out.print(toString() + " is equal to " + h + ":" + m + ":" + s + " ? ");

        return (h == hours && m == minutes && s == seconds);
    }

    void hoursIncrement() {
        System.out.println("hours increment ...");

        hours++;

        setRightTime();
    }

    void hoursDecrement() {
        System.out.println("hours decrement ...");
        hours--;

        setRightTime();
    }

    void secondsIncrement() {
        seconds++;

        setRightTime();
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

        if(hours > h) {
            output = 1;
        } else if(hours < h) {
            output = -1;
        } else {
            if(minutes > m) {
                output = 1;
            } else if(minutes < m) {
                output = -1;
            } else {
                if(seconds > s) {
                    output = 1;
                } else if(seconds < s) {
                    output = -1;
                } else {
                    output = 0;
                }
            }

        }
        return output;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
