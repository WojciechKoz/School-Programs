public abstract class Employee{
    private String surname;
    float workTime;

    Employee(String surname, float workTime) {
        this.surname = surname;
        this.workTime = workTime;
    }

    public String toString() {
        return surname + " " + workTime;
    }

    String getSurname() {
        return surname;
    }

    abstract float wage();
    abstract String showDetails();
}


