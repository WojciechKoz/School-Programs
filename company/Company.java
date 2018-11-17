class Company {
    static final float HOURS = 160;
    private static final int NUM_OF_JOBS = 30;
    private Employee[] employees = new Employee[NUM_OF_JOBS];

    Company() {

    }

    void hireWorker(String surname, float workTime, float salary, int hours) {
        for(int i = 0; i < NUM_OF_JOBS; i++) {
            if(employees[i] == null) {
                continue;
            }
            if(employees[i].getSurname().equals(surname)) {
                System.out.println("there is already a person with that name");
                return;
            }
        }

        for(int i = 0; i < NUM_OF_JOBS; i++) {
            if(employees[i]== null) {
                employees[i] = new Worker(surname, workTime, hours, salary);
                break;
            }
        }
    }

    void hireOfficial(String surname, float workTime, float bonus, float salary) {
        for(int i = 0; i < NUM_OF_JOBS; i++) {
            if(employees[i] == null) {
                continue;
            }
            if(employees[i].getSurname().equals(surname)) {
                System.out.println("there is already a person with that name");
                return;
            }
        }

        for(int i = 0; i < NUM_OF_JOBS; i++) {
            if(employees[i] == null) {
                employees[i] = new Official(surname, workTime, bonus, salary);
                break;
            }
        }
    }

    void releaseEmployee(String surname) {
        for(int i = 0; i < NUM_OF_JOBS; i++) {
            if(employees[i] == null) {
                continue;
            }

            if(employees[i].getSurname().equals(surname)) {
                employees[i] = null;
                break;
            }
        }
    }

    int numberOfEmployees() {
        int output = 0;

        System.out.print("\nnumber of employees : ");

        for(Employee employee : employees) {
            if(employee != null) {
                output++;
            }
        }
        return output;
    }

    void list() {
        System.out.println("\nnum surname workTime");
        for(int i = 0; i < NUM_OF_JOBS; i++) {
            if(employees[i] == null)
                continue;
            System.out.println(i + " " + employees[i].toString());
        }
    }

    void exactList() {
        System.out.println("\nnum surname workTime group");
        for(int i = 0; i < NUM_OF_JOBS; i++) {
            if(employees[i] == null)
                continue;
            System.out.println(i + " " + employees[i].showDetails());
        }
    }

    float sumOfWages() {
        float output = 0;
        for(Employee employee : employees) {
            if(employee == null) {
                continue;
            }
            output += employee.wage();
        }

        return output;
    }

    float sumOfWorkersWages() {
        float output = 0;
        for(Employee employee : employees) {
            if(employee == null) {
                continue;
            }
            if(employee instanceof Worker)
                output += employee.wage();
        }

        return output;
    }

    float sumOfOfficialsWages() {
        float output = 0;
        for(Employee employee : employees) {
            if(employee == null) {
                continue;
            }
            if(employee instanceof Official)
                output += employee.wage();
        }

        return output;
    }

    void listWithWages() {
        System.out.println("\nnum surname workTime group wage");
        for(int i = 0; i < NUM_OF_JOBS; i++) {
            if(employees[i] == null)
                continue;
            System.out.println(i + " " + employees[i].showDetails() + " " + employees[i].wage());
        }
    }

}
