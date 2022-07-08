package exceptionHandling;

public class UnCheckedExceptions {
    //Runtime exceptions
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("printing");
        String s = null;
        try {
            System.out.println(s.charAt(1));
        } finally {
            System.out.println("final block");
        }


        String[] strArr = new String[2];
        strArr[0] = "12344";
        strArr[1] = "abc";
        try {
            strArr[2] = "hfuihg";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array is not created for allowing more than two values");
        }

    }
}
