package runtimeValues;

import java.util.Scanner;

public class CheckIfHeIsAMajor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name :: ");
        String firstname = scanner.nextLine();
        System.out.println("Enter the lastname name :: ");
        String lastname = scanner.nextLine();
        System.out.println("Enter the your age :: ");
        int myAge = scanner.nextInt();
        //myAge is >18 then he is a major || myAge is less than or equal to 18 then he is a minor
        if (myAge > 18) {
            System.out.println("Hi, My name is " + firstname + " " + lastname + " and I am a major");
        } else if (myAge == 18) {
            System.out.println("Hi, My name is " + firstname + " " + lastname + " and I am a major");
        } else {
            System.out.println("Hi, My name is " + firstname + " " + lastname + " and I am a minor");
        }
        //check if the person is a valid person for vaccine
        //1-18 valid and 65-100 valid
    }
}
