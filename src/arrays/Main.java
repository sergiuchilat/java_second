package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main instance = new Main();
        instance.hardCode();

        int[] numbers = {1, 2, 3};
        System.out.println("Sum = " + instance.arraySum(numbers));
        System.out.println("Sum = " + instance.arraySum(new int[] {
                1, 2, 3
        }));
    }

    private void hardCode() {
        int[] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        numbers[2] = 4;
        for (int number : numbers) {
            System.out.println(number);
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6, 4},
                {7, 8, 9}
        };

        int[][] matrixPlus;
        matrixPlus = new int[10][];


        int[] list = new int[5];

        int[][][] cubic;

        int[] arr;
        arr = new int[10];
        System.out.println(arr[0]);
        arr[0] = 123;
        System.out.println(arr[0]);
        arr = new int[20];

        System.out.println(arr.length);
        System.out.println(arr[0]);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private int arraySum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
