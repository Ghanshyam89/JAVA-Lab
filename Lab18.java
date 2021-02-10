// WAP to delete duplicate values from HashMap.

package Assignments;

import java.util.*;

public class Lab18 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("u", "33");
        map.put("v", "12");
        map.put("w", "12");
        map.put("x", "73");
        map.put("y", "33");

        System.out.printf("Before: %s%n", map);
        Set<String> mySet = new HashSet<>();

        for (Iterator itr = map.entrySet().iterator(); itr.hasNext();) {
            Map.Entry entrySet = (Map.Entry) itr.next();

            String value = (String) entrySet.getValue();

            if (!mySet.add(value)) {
                itr.remove();
            }
        }
        System.out.printf("After: %s%n", map);
    }
}
