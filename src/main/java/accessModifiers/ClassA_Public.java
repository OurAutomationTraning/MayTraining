package accessModifiers;

public class ClassA_Public {
    //public -- we can access it across the project
    //private -- we can access it only in that class
    //protected -- You can access it in all the classes of that package and the classes extending the parent class
    //default -- you can access them only in the classes of that package

    public void ClassA_Public( ) {

    }
    //variables, methods, constructors, class
    protected static int myAge = 20;// class level variable or field

    public static int add(int a , int b) {
        int c = a +b; //method variables
        return c;
    }

    protected static int add(int a, int b, int z) {
        myAge = a+b+z;//method variables
        return myAge;
    }
}
