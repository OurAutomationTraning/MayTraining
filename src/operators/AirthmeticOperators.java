package operators;

public class AirthmeticOperators {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
       /* + addition
       - subtraction
       * multiplication
       / division
        */
        System.out.println("Sum of numbers ::  " + (a+b));
        System.out.println("subtraction :: " + (a-b));
        System.out.println("Multiplication :: " + (a*b));
        System.out.println("division :: " + (a/b));
        int c=101;
        c+=a; //c=c+1
        System.out.println(c);
        System.out.println(++c);//c=103
        System.out.println(c++);
        System.out.println(c);
        System.out.println(--c);
        System.out.println(c--);
        System.out.println(c);

    }
}
