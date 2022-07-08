package collectionsInJava.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMapping = new HashMap<>();
        ageMapping.put("abc", 10);
        ageMapping.put("ac", 110);
        ageMapping.put("bc", 450);
        ageMapping.put("aa", 151);
        ageMapping.put("cc", 151);
        ageMapping.put("abdsfc", 5649);
        ageMapping.put("abdsfc", 87987);
        ageMapping.putIfAbsent("abdsfc", 1235);
        System.out.println(ageMapping.get("abdsfc"));
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.putAll(ageMapping);
        //How to iterate from a map
        /*Set<Map.Entry<String, Integer>> entries = ageMapping.entrySet();
        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }*/

        Set<String> strings = ageMapping.keySet();
        for (String str:strings) {
            System.out.println(str + "=" +ageMapping.get(str));
        }
    }
}
