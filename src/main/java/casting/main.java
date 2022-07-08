package casting;

public class main {
    public static void main(String[] args) {
        Version2 obj = new Version2();
        obj.ac();
        obj.accelerator();
        Version1 obj1 = (Version2) obj;// from child class creating parent class object is called as up casting
        obj1.ac();
        obj1.accelerator();
        Version1 obj2 = (Version1) obj1;// from parent class creating child class object is called as down casting
        //byte<short<int<long<double
        long l =100;
        int a = (int)l;
    }
}
