package StringPrograms;

public class RemoveEmptySpacesInString {
    public static void main(String[] args) {
        String s = " my name is ***** ";
        System.out.println(s.trim());
        System.out.println(s.replaceAll(" ",""));
        System.out.println(s.replaceAll("\\s+",""));
    }
}
