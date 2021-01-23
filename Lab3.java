// WAP to capitalize the first and the last letter of each word in a line.
package Assignments;

public class Lab3 {
    public static void main(String[] args) {
        String s = "mr ram is a boy a b";
        char arr[] = s.toCharArray();
        int l = 0, i = 0;

        for (i = 0; i < s.length(); i++) {
            if (arr[i] == ' ') {
                if (l == 1) {
                    arr[i - l] = (char) (arr[i - l] - 32);
                    l = 0;
                } else {
                    arr[i - l] = (char) (arr[i - l] - 32);
                    arr[i - 1] = (char) (arr[i - 1] - 32);
                    l = 0;
                }
            } else {
                l++;
            }
        }
        if (l > 0) {
            if (l == 1) {
                arr[i - l] = (char) (arr[i - l] - 32);
            } else {
                arr[i - l] = (char) (arr[i - l] - 32);
                arr[i - 1] = (char) (arr[i - 1] - 32);
            }
        }
        System.out.println();

        System.out.print(arr);
        
        System.out.println();
        System.out.println();
    }
}
