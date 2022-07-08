package staticAndNonStatic;

public class FirstClass {
    static final int age = 20;
    int otherAge = 21;

    //static method cannot use any non-static content like variables and methods
    //non static method can can use both static and non static content like methods and variables
    public int addAllAges() {
//        age = 30;
        return age + otherAge;
    }

    public int addAllAgesWithoutReassigning() {
        return age + otherAge;
    }

    public static int addAge() {
        int j = 10;
        return j + age;
    }
}
