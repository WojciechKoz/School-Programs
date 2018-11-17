class Official extends Employee {
    private float bonus;
    private float rate;

    Official(String surname, float workTime, float bonus, float rate) {
        super(surname, workTime);

        this.bonus = bonus;
        this.rate = rate;
    }

    String showDetails() {
        return toString() + " Official";
    }

    float wage() {
        return workTime * rate * (bonus/100 + 1);
    }

}