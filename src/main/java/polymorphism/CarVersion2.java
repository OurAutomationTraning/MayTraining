package polymorphism;

import java.util.Locale;

public class CarVersion2 extends CarVersion1{
    /*Method overloading - Here i am representing the add method
    in different forms by adding multiple parameters or different types of parameters
    In method overloading the name of the method remains same but the method signature should be different
    How to achieve:-
    1. Keeping the method name same but change the parameter's
    method overloading:- We create a method with same name as method already defined in the same class but method
    signature should be different
    method overriding:- We create a method with same name as method in parent class and method signature remains same
    */

    public int add(int a, int b) {//method signature = methodName+number of parameters+type of parameters+returnype
        //add2intint
        return (a+b);
    }

    public int add(int a, int b, int c) {//method signature = methodName+number of parameters+type of parameters
        //add2intintint
        return (a+b+c);
    }

    public String add(String c, String d) {//add2StringString
        return (c+d);
    }

    @Override
    public String tyres(String side) {
        if (side.toLowerCase(Locale.ROOT).equals("front")) {
            return "MRF";
        } else {
            return "Mitsubishi";
        }
    }

    @Override
    public void engine() {
        System.out.println("engine version 2");
    }

}
