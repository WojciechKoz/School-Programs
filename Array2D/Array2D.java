import java.util.Random;

class Array2D {
    int [][] elements;

    Array2D(int width, int height, int z) {
        elements = new int[height][width];

        fill(z);
    }

    private void fill(int z) {
        Random generator = new Random();

        for(int i = 0; i < elements.length; i++) {
            for(int j = 0; j < elements[i].length; j++) {
                elements[i][j] = generator.nextInt(z) + 1;
            }
        }
    }

    void print() {
        for (int[] row : elements) {
            for (int element :  row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    void printTrans() {
        for(int i = 0; i < elements[0].length;  i++) {
            for(int j = 0; j < elements.length; j++) {
                System.out.print(elements[j][i] + " ");
            }
            System.out.println();
        }

    }

    int[] size() {
        return new int[] {elements.length, elements[0].length};
    }

    int sum() {
        int value = 0;

        for(int[] row: elements) {
            for(int element : row) {
                value += element;
            }
        }

        return value;
    }

    void min() {
        int minimum = elements[0][0];

        for (int[] row : elements) {
            for (int element : row) {
                if (element <= minimum) {
                    minimum = element;
                }
            }
        }
        System.out.println("minimum = " + minimum);

        for(int i = 0; i < elements.length; i++) {
            for(int j = 0 ; j < elements[0].length; j++) {
                if(elements[i][j] == minimum) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    int[][] find(int target) {
        int [][] allElem = new int[0][2];

        for(int i = 0; i < elements.length; i++) {
            for(int j = 0; j < elements[i].length; j++) {
                if(elements[i][j] == target) {
                   int [][] temp = new int [allElem.length+1][2];

                    System.arraycopy(allElem, 0, temp, 0, allElem.length);

                    temp[temp.length-1][0] = i;
                    temp[temp.length-1][1] = j;

                    allElem = temp;
                }
            }
        }
        if(allElem.length == 0) {
            return new int[][] {{-1, -1}};
        }

        return allElem;
    }

    int[] sumOfColumn() {
        int [] output = new int[elements[0].length];

        for (int[] element : elements) {
            for (int j = 0; j < element.length; j++) {
                output[j] += element[j];
            }
        }

        return output;
    }

    void printMostValuableColumn() {
        int [] sum = sumOfColumn();
        int max = sum[0];
        int maxIndex = 0;

        for(int i = 0; i < sum.length; i++) {
            if(sum[i] > max) {
                max = sum[i];
                maxIndex = i;
            }
        }

        System.out.println("value of column = " + max + " with index " + maxIndex);
    }

    void delete() { // delete one row and one column which contain max valuable number
        int max = elements[0][0];
        int indexI = 0, indexJ = 0;

        for(int i = 0; i < elements.length; i++) {
            for(int j = 0; j < elements[0].length; j++) {
                if(elements[i][j] > max) {
                    max = elements[i][j];

                    indexI = i;
                    indexJ = j;
                }
            }
        }

        int [][] newArr = new int [elements.length-1][elements[0].length-1];

        int offsetI = 0, offsetJ = 0;

        for(int i = 0; i < elements.length; i++) {
            if(i == indexI)
                continue;

            for(int j = 0; j < elements[i].length; j++) {
                if(j == indexJ)
                    continue;

                newArr[offsetI][offsetJ] = elements[i][j];

                offsetJ++;

            }
            offsetJ = 0;

            offsetI++;
        }
        elements = newArr;
    }
}
