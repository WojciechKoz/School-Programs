public class Main {
    public static void main(String [] args) {
        Shop shop = new Shop();

        shop.printAll();

        shop.addNew("bialy", "combi", 4, 140);
        System.out.println();

        shop.printAll();

        shop.speedTests();
    }
}
