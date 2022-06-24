package StringPrograms;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String s = "I am from india";
        String[] sarr = s.split(" ");
        Arrays.stream(sarr).forEach(e-> System.out.println(e));
        s = "Hey , Are ,You , Listening ";
        sarr = s.split(",");
        Arrays.stream(sarr).forEach(e-> System.out.println(e));
        s = "Hey , Are ,You , Listening ";
        sarr = s.split(",",3);
        Arrays.stream(sarr).forEach(e-> System.out.println(e));
    }

    //kongara bharghav sravan -- Kongara Bharghav Sravan
}
