package arrays;

public class PrintSquares {
    public static void main(String[] args) {
        int arr[][] = new int[5][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <=10; j++) {
                int presentNumber = ((10 * i) + j);
                arr[i][j-1] = presentNumber * presentNumber;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

