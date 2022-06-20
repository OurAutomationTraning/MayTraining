package loops;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        double factorialValue = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Give the value you want factorial for :: ");
        double factorialValueOf = scan.nextInt();
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/
        for (double i = 1; i <= factorialValueOf; i++) {
            factorialValue *= i;
        }
        System.out.println(factorialValue);
        //5=5*4*3*2*1

    }

}
