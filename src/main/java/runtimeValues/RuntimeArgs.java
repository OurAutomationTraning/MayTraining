package runtimeValues;

public class RuntimeArgs {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("The sum of two numbers is :: " + (a+b));
    }
}
