package polymorphism;

public class Test {
    static Object version2;

    public static void main(String[] args) {
        version2 = new CarVersion2();
        System.out.println(((CarVersion2)version2).add(1,2));
        System.out.println(((CarVersion2)version2).add(1,2,3));
        System.out.println(((CarVersion2)version2).add("ab","bc"));

        CarVersion1 version1 = new CarVersion2();
        System.out.println(version1.tyres("front"));
        version1.engine();
        version1.accelerator();
        version1 = new CarVersion1();
        System.out.println(version1.tyres("front"));
        version1.engine();
        version1.accelerator();
    }
}
