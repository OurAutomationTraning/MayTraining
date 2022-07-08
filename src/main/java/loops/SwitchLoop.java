package loops;

import java.util.Locale;
import java.util.Scanner;

public class SwitchLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name :: ");
        String s = scanner.nextLine();
        /*if(s.equalsIgnoreCase("bharghav")) {
            System.out.println("it is my first name");
        } else if(s.equalsIgnoreCase("sravan")) {
            System.out.println("It is my lastname");
        } else if(s.equalsIgnoreCase("Kongara")) {
            System.out.println("It is my initial");
        } else {
            System.out.println("it is not my name");
        }*/

        switch (s.toLowerCase(Locale.ROOT)) {
            case "bharghav":
                System.out.println("it is my first name");
                break;
            case "sravan":
                System.out.println("It is my lastname");
                break;
            case "kongara":
                System.out.println("It is my initial");
                break;
            default:
                System.out.println("it is not my name");
                break;
        }
        int age = 18;
        switch (age) {
            case 18:
                System.out.println("My age is 18");
                break;
            case 20:
                System.out.println("My age is 20");
                break;
            case 21:
                System.out.println("My age is 21");
                break;
            default:
                System.out.println("it is not my name");
                break;
        }

    }
}
