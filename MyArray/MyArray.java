import java.util.Random;

public class MyArray {
    private int [] parameter;

    MyArray(int size) {
        parameter = new int[size];
    }

    int size() {
        return parameter.length;
    }

    void fill(int a) {
        Random gen = new Random();

        for(int i = 0; i < parameter.length; i++) {
            parameter[i] = gen.nextInt(a);
        }
    }

    void print() {
        for(int element : parameter) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    void swap() {
        for(int i = 0; i < parameter.length / 2; i++) {
            int temporary = parameter[i];

            parameter[i] = parameter[parameter.length - i -1];
            parameter[parameter.length - 1 - i] = temporary;
        }
    }

    int search(int target) {
        for(int i = 0; i < parameter.length; i++) {
            if(parameter[i] == target) {
                return i;
            }
        }
        return -1;
    }

    void printExtremum() {
        int min = parameter[0], max = parameter[0];
        int minIndex = 0, maxIndex = 0;

        for(int i = 1; i < parameter.length; i++) {
            if(parameter[i] < min) {
                min = parameter[i];
                minIndex = i;
            }
            if(parameter[i] > max) {
                max = parameter[i];
                maxIndex = i;
            }
        }

        System.out.println("minimum : " + min + " has index : " + minIndex);
        System.out.println("minimum : " + max + " has index : " + maxIndex);
    }

    double average() {
        int value = 0;

        for(int e : parameter) {
            value += e;
        }

        return (double)value / parameter.length;
    }

    double sigma() {
        double average = average();
        int counter = 0;

        for(int e : parameter) {
            counter += (e - average)*(e - average);
        }

        return Math.sqrt((double)counter / parameter.length);
    }

    boolean diffValues() {
        for(int i = 0; i < parameter.length; i++) {
            for(int j = i+1; j < parameter.length; j++) {
                if(parameter[i] == parameter[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    void makeDiffValues() {
        boolean [] unique = new boolean[parameter.length];
        int counter = 0;

        for (int i = 0; i < unique.length; i++) {
            unique[i] = true;
        }

        for(int i = 0; i < parameter.length; i++) {
            for(int j = 0; j < i; j++) {
                if(parameter[j] == parameter[i])
                    unique[i] = false;
            }
            if(unique[i])
                counter ++;
        }

        for(boolean b : unique) System.out.print(b ? "N" : ".");
        System.out.println();

        int [] newparameter = new int[counter];
        int j = 0;
        for (int i = 0; i < parameter.length; i++) {
            if(unique[i]) {
                newparameter[j] = parameter[i];

                j++;
            }
        }
        parameter = newparameter;
    }

    int max() {
        int max = 0;
        for(int e : parameter) {
            if(max < e) {
                max = e;
            }
        }
        return max;
    }

    void list() {
        int max = max();

        for(int i = 0; i <= max; i++) {
            int counter = 0;

            for(int j = 0; j < parameter.length; j++) {
                if(parameter[j] == i) {
                    counter++;
                }
            }
            System.out.println(i + " : " + counter + " times");
        }
    }
}
