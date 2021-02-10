// WAP to add StringBuffer into HashSet traverse HashSet

package Assignments;

import java.util.HashSet;
import java.util.Iterator;

public class Lab15 {
    public static void main(String[] args) {
        
        HashSet set = new HashSet();
        
        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("abc"));
        
        Iterator<Integer> iterate = set.iterator();
        
        System.out.println("traversing the hashSet:");
        
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }
}