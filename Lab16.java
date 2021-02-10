// WAP to print elements of LinkedHashSet into ascending order.

package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Lab16 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(30);

        System.out.println("Before sort: " + set);

        ArrayList<Integer> array = new ArrayList<>(set);

        Collections.sort(array);

        System.out.println("After sort: " + array);
    }
}