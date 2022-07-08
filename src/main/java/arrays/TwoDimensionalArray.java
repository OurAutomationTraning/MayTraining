package arrays;


import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {11, 22, 33, 44, 55, 66, 77, 88, 99, 110};
        int[][] twoDimArr = new int[2][10];
        twoDimArr[0] = a;
        twoDimArr[1] = b;
        System.out.println(twoDimArr[0][5]);
        System.out.println(twoDimArr[1][5]);
        int[][] dimArr = new int[10][20];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 20; j++) {
                dimArr[i - 1][j - 1] = i * j;
            }
        }
        int[][][] threeDimensionalArray = new int[2][10][20];
        threeDimensionalArray[0] = twoDimArr;
        threeDimensionalArray[1] = dimArr;
        Arrays.stream(threeDimensionalArray).forEach(e -> {
            Arrays.stream(e).forEach(d -> {
                Arrays.stream(d).forEach(n -> {
                    System.out.println(n);
                });
            });
        });

        for (int i = 0; i < threeDimensionalArray.length; i++) {
            int[][] ints = threeDimensionalArray[i];
            for (int j = 0; j < ints.length; j++) {
                int[] anInt = ints[j];
                for (int k = 0; k < anInt.length; k++) {
                    System.out.println(anInt[k]);
                }
            }
        }
    }
}
