package runtimeValues;

import java.util.Scanner;

public class UsingScannerClass {
    //Using scanner class take some runtime variables like age print if he is a major or minor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name :: ");
        String firstname = scanner.nextLine();
        System.out.println("Enter the lastname name :: ");
        String lastname = scanner.nextLine();
        System.out.println("Enter the your age :: ");
        int myAge = scanner.nextInt();
        System.out.println("Hi, My name is " + firstname +" " + lastname + " and my age is " + myAge);
    }
}
