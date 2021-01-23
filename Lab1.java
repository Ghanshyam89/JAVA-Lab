// WAP to print characters of string one by one.

package Assignments;

public class Lab1 {
    public static void main(String[] args) {

        String s1 = "JAVA by Rajesh Sir";
        char[] ch = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            System.out.println("char at " + i + " index is: " + ch[i]);
        }
    }
}