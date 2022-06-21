package arrays;

import java.util.Arrays;

public class IntegerArray {
    public static void main(String[] args) {
        int i = 10;
        String s = "ABC";
        char c = '+';
        boolean a = true;
        int[] arr = new int[]{10, 20, 30, 40, 50, 10, 20};// 0 to n-1 for index  1 to n is length
        String[] strArr = new String[]{"abc", "bca", "cba"};
        char[] carr = new char[]{'+', 'c'};
        boolean[] boolArr = new boolean[]{true, false, false, false};
        /*System.out.println(arr[3]);
        System.out.println(arr.length);*/
        /*for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }*/

        /*for (int j = 0; true ; j++) {
            System.out.println(arr[j]);
            if(j==arr.length-1)
                break;
        }*/
        /*int index = 0;
        while (index < arr.length) {
            System.out.println(arr[index]);
            index++;
        }*/

        //iterate from reverse
        /*for (int j = arr.length-1; j >-1; j--) {
            System.out.println(arr[j]);
        }*/

        /*int index = arr.length - 1;
        while (index >= 0) {
            System.out.println(arr[index]);
            index--;

        }*/
//advanced for loop or for-each loop
        /*for (int var : arr) {
            System.out.println(var);
        }*/
        //lambda expression
        /*Arrays.stream(arr).forEach(e->{
            System.out.println(e);
        });*/
        /*Arrays.stream(arr).forEachOrdered(e->{
            System.out.println(e);
        });*/


    }
}
