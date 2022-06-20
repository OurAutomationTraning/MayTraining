package runtimeValues;

import java.util.Scanner;

public class CheckIfHeIsValidForVaccine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name :: ");
        String firstname = scanner.nextLine();
        System.out.println("Enter the lastname name :: ");
        String lastname = scanner.nextLine();
        System.out.println("Enter the your age :: ");
        int myAge = scanner.nextInt();

        /*if (myAge > 0 && myAge < 18) {
            System.out.println("valid");
        } else if (myAge > 64 && myAge < 101) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }*/
        if ((myAge >= 1 && myAge <= 17) || (myAge >= 64 && myAge <= 100)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        /*Take two things available balance and balance required for this tag.
        check if there is enough balance then print "valid tag"
         print "invalid tag"*/
    }
}
