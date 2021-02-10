// WAP to add user defined class object into TreeSet as value , Integer as key and traverse TreeSet.

package Assignments;

import java.util.*;

class employee {

    private final int salary;
    private final String name;

    public employee(int value, String name) {
        this.salary = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return salary;
    }

}

class mission implements Comparator<employee> {
    public int compare(employee s1, employee s2) {
        return s1.getMarks() - s2.getMarks();
    }
}

public class Lab17 {

    public static void main(String[] args) {

        TreeSet<employee> set = new TreeSet<>(new mission());

        set.add(new employee(44450, "Ghanshyam"));
        set.add(new employee(34841, "Ashutosh"));
        set.add(new employee(98134, "Ankit"));
        set.add(new employee(55490, "Shailendra"));

        System.out.println("Printing the elements in increasing order of Integer as key i.e; salary.");

        for (employee ele : set) {
            System.out.println(ele.getName() + " " + ele.getMarks());
        }

    }
}
