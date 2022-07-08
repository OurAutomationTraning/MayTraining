package collectionsInJava.list;

import java.util.*;

public class ListSample {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 10, 20};
        List<Integer> intList = new ArrayList<>(); //oldCapacity=10
        intList.add(1014);
        intList.add(250);
        intList.add(360);
        intList.add(40);
        intList.add(10);
        intList.add(10);
        intList.add(62150);
        intList.add(70);
        intList.add(20);
        intList.add(840);
        intList.add(100);
        intList.add(-90);
        intList.set(8, -650);
        intList.set(9, -100);
        //(oldCapacity*3)/2+1 == 16
        System.out.println("Size of the list is :: " + intList.size());
         for (int var : intList) {
            System.out.println(var);
        }

        Collections.sort(intList);
        Collections.reverse(intList); //to reverse an list
        intList.remove(2);

        List<Integer> intList2 = new ArrayList<>();
        intList2.add(110);
        intList2.add(20);
        intList2.add(62150);
        boolean contains = intList2.contains(2);
        intList.removeAll(intList2);
        boolean containsList = intList.containsAll(intList2);
        System.out.println("contains all the values :: " + containsList);


        ListIterator<Integer> integerListIterator = intList.listIterator();
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next());
        }

        LinkedList<String> stringList = new LinkedList<>();

    }
}
