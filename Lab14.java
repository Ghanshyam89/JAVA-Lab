// WAP to add user defined class object into LinkedList and traverse LinkedList.

package Assignments;

import java.util.LinkedList;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo+"  "+name.toString();
    }
    
}

public class Lab14 {
    public static void main(String[] args) {
        LinkedList<Student> ll = new LinkedList<>();

        ll.add(new Student(10, "Ashutosh"));
        ll.add(new Student(20, "Ankit"));
        ll.add(new Student(30, "Deepak"));

        // Using the Get method and the
        // for loop
        for (int i = 0; i < ll.size(); i++) {

            System.out.print(ll.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (Student str : ll)
            System.out.print(str + " ");
    }
}
