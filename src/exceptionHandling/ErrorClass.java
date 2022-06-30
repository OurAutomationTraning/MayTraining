package exceptionHandling;

public class ErrorClass {
    public static void main(String[] args) {
        try {
            print("uren");
        } catch (Throwable e) {
            System.out.println("catch block");
        }
    }
     public static void print(String s) {
        print(s);
     }
}
