package dummy;

import accessModifiers.ClassA_Public;

public class NewClass {
    public static void main(String[] args) {
        ClassA_Public classA_public = new ClassA_Public();// A a = new A();
        System.out.println(classA_public.myAge);
        System.out.println(classA_public.add(1,2,3));
    }

}

