public class Main {
    private static Company company = new Company();

    public static void main(String[] arg) {
        company.hireWorker("Kowalski", 1.1f,6 , 170);

        company.hireOfficial("Malinowski", 0.9f, 10, 6000);

        company.hireWorker("Lis", 1.3f,7 , 200);

        company.hireOfficial("Kozłowski", 1.1f, 40, 9000);

        company.list();

        System.out.println();

        company.exactList();

        company.listWithWages();

        System.out.println("\nsum of wages : " + company.sumOfWages());
        System.out.println("sum of officials wages : " + company.sumOfOfficialsWages());
        System.out.println("sumof workers wages : " + company.sumOfWorkersWages());

        company.releaseEmployee("Kowalski");
        company.releaseEmployee("Malinowski");

        System.out.println();

        company.list();

        System.out.println(company.numberOfEmployees());
    }
}
