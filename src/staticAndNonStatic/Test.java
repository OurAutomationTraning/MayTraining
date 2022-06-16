package staticAndNonStatic;

public class Test {
    public static void main(String[] args) {
        FirstClass firstclass = new FirstClass();
        /*System.out.println(firstclass.addAllAges());
        System.out.println(firstclass.otherAge);
        System.out.println(firstclass.addAge());
        System.out.println(firstclass.age);


        System.out.println(FirstClass.addAge());
        System.out.println(FirstClass.age);*/
        System.out.println(firstclass.addAllAgesWithoutReassigning());
        System.out.println(firstclass.addAllAges());
        System.out.println(firstclass.addAllAgesWithoutReassigning());
    }
}
