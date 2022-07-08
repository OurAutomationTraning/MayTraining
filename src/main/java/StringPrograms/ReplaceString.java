package StringPrograms;

public class ReplaceString {
    public static void main(String[] args) {
        String s = "I am from india";
        s = s.replace("india","USA").replace("from","an");
        System.out.println(s);
        String s1 = "I am24 from12242 155";
        s1 = s1.replaceAll("[0-9]","");
        System.out.println(s1);
        s1 = "I am24 from1224$2 155.*7";
        s1 = s1.replaceAll("[^A-Za-z0-9 ]","");
        System.out.println(s1);
    }
}
