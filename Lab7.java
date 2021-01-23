// WAP to pass a number to method and check given number is prime number or not and call that method by thread.

package Assignments;

import java.util.Scanner;

class MyThread1 extends Thread {

    public boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scan.nextInt();
        scan.close();
        boolean isprime = isPrime(num);
        if (isprime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

public class Lab7 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        new MyThread1().start();

        System.out.println(t.getName());
    }
}