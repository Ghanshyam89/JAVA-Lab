// WAP to add user defined class into Vector and traverse Vector by Enumeration.

package Assignments;

import java.util.Enumeration;
import java.util.Vector;

public class Lab13 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        // Add elements into Vector
        vector.add("Ankit");
        vector.add("Ashutosh");
        vector.add("Aiman");
        vector.add("Jin");
        vector.add("Jacob");

        // Get Enumeration of Vector elements
        Enumeration en = vector.elements();

        /*
         * Display Vector elements using hashMoreElements() and nextElement() methods.
         */
        System.out.println("Vector elements are: ");
        while (en.hasMoreElements())
            System.out.println(en.nextElement());

    }
}
