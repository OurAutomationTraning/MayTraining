package collectionsInJava.set;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet();//Doesn't follow any order
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TreeSet<String> treeSet = new TreeSet();

        for (int i = 1000; i >= 1; i--) {
            hashSet.add(i + "a");
            linkedHashSet.add(i + "a");
            treeSet.add(i + "a");
        }
        Date d = new Date();
        treeSet.stream().forEach(str -> {
            System.out.println(str);
        });
        Date afterDate = new Date();
        System.out.println("total time taken in milliseconds for normal streaming:: " +(afterDate.getTime()-d.getTime()));
        d = new Date();
        treeSet.parallelStream().forEach(str -> {
            System.out.println(str);
        });
        afterDate = new Date();
        System.out.println("total time taken in milliseconds for parallel streaming:: " +(afterDate.getTime()-d.getTime()));
    }
}
