package StringPrograms;

import java.util.Arrays;

public class StringToCharacterArray {
    public static void main(String[] args) {
        String s = "Hi How are you";
        System.out.println(s);
        char[] carr = s.toCharArray();
        String s1="";
        for (int i = carr.length-1; i >=0 ; i--) {
            s1 += carr[i];
        }
        System.out.println(s1);
    }// print the string in reverse
}
