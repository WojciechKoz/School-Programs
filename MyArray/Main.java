public class Main {

    public static void main(String [] args) {
        MyArray tab = new MyArray(20);

        tab.fill(8);

        tab.print();

        tab.list();

        tab.swap();

        tab.print();

        System.out.println(tab.search(5));

        tab.printExtremum();

        System.out.println(tab.sigma());

        System.out.print("has unique values ? ");
        System.out.println(tab.diffValues());

        tab.makeDiffValues();

        System.out.print("has unique values ? ");
        System.out.println(tab.diffValues());

        tab.print();
    }
}
