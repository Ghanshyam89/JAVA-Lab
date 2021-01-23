// Program to remove all characters in a string except alphabets.

package Assignments;

public class Lab2 {
    public static void main(String[] args) {
        String s1 = new String("SISTEC234@#$GHANDHI32@#$@#NAGAR");
        boolean flag = false;
        System.out.println();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z' || s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
                System.out.print(s1.charAt(i));
                flag = true;
            } else if (flag) {
                System.out.print(" ");
                flag = false;
            }
        }
        System.out.println();
        System.out.println();
    }
}
