package StringPrograms;

import java.util.Locale;

public class EqualStrings {
    public static void main(String[] args) {
        String a = "abc";
        String b = "bca";
        String c = "abc";
        String d = "ABC";
        if (a.equals(b)) {
            System.out.println("a is equal to b");
        } else if (a.equals(c)) {
            System.out.println("a is equal to c");
        }

        if(a.equalsIgnoreCase(d)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(d.toLowerCase(Locale.ROOT));
        if(a.toLowerCase(Locale.ROOT).equals(d.toLowerCase(Locale.ROOT))) {
            System.out.println(true);
        }

        String abc = "I am from India";
        if(abc.toLowerCase(Locale.ROOT).contains("india")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
