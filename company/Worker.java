class Worker extends Employee {
    private float rate;
    private int hours;

    Worker(String surname, float workTime,int hours, float rate) {
        super(surname, workTime);

        this.rate = rate;
        this.hours = hours;
    }

    String showDetails() {
        return toString() + " Worker";
    }

    float wage() {
        if(hours/Company.HOURS < workTime) {
            return hours*rate;
        } else {
            return workTime*Company.HOURS*rate + (hours/Company.HOURS - workTime)*rate*1.5f;
        }
    }
}