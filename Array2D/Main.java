public class Main {
    public static void main(String [] args) {

        Array2D myArray = new Array2D(7, 5, 9);

        myArray.print();

        System.out.println();

        myArray.printTrans();

        System.out.println("size " + myArray.size()[0] + " " + myArray.size()[1]);

        System.out.println("sum of all elements " + myArray.sum());

        myArray.min();

        System.out.println("indexes of found number (5)");

        int[][] foundNum = myArray.find(5);

        for (int[] aFoundNum : foundNum) {
            System.out.println(aFoundNum[0] + " " + aFoundNum[1]);
        }System.out.println();

        int [] sum = myArray.sumOfColumn();

        System.out.println("sum of every column : ");

        for(int ele : sum) {
            System.out.print(ele + " ");
        }System.out.println();

        myArray.printMostValuableColumn();

        myArray.delete();

        myArray.print();
    }
}
