package dataTypes;


public class PrimitiveDataTypes {
    //Primitive data types
    static boolean isAgeAbove18 = true;
    static char character = 'C';
    static byte lessNumber = 127; //-128 to 127
    static short shortD = -32768;//-32768 to 32767
    static int intNumber = 396945641;//-2^31 to 2^31-1 (-2147483648 to 2147483647)
    static long longNumber = 1l; //-2^63 to 2^63-1  (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
    static float floatNumber = 9223372036854775809.02F;
    static double doubleNumber = 1021561561515155656415645456455456465456465415645646545454566.1d;
    //Wrapper classes
    static String str = "This is a training class happening on 14-07-2022";
    Boolean b = true;
    Character c = 'b';
    Byte d = 1;
    Integer i = 10;
    int[] a = new int[]{1, 2, 3, 54, 6, 63};
    static int age=18;
    static String s = "My age is ";

    public static void main(String[] args) {
        System.out.println(s+age);
        System.out.println("The multiplication of two float numbers is "+mulFloatNumbers(1.01F,2.02F));
        System.out.println(addTwoChars('a','b'));
       /* System.out.println("Hello world");
        System.out.println(intNumber);
        System.out.println(isAgeAbove18);
        System.out.print("gdfysb");
        System.out.print("1234");
        System.err.println("\nThere is a error");
        System.out.println("Sum of to numbers :: " + addTwoNumbers(123, 321));*/
    }

    public static int addTwoNumbers(int a, int b) {
        return (a + b);
    }

    public static int subNumbers(int a, int b) {
        return (a - b);
    }

    public static int mulNumbers(int a, int b) {
        return (a * b);
    }

    public static int divNumbers(int a, int b) {
        return (a / b);
    }

    public static long divLongNumbers(long a, long b) {
        return (a / b);
    }
    public static float mulFloatNumbers(float a, float b) {
        return (a * b);
    }

    public static String addTwoChars(char a, char b) {

        return a +""+ b;
    }
}
