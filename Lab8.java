// WAP that perform two tasks using two threads simultaneously (identify tasks by yourself).

package Assignments;

class ThreadA extends Thread {
    int num;

    public ThreadA(int num) {
        this.num = num;
    }

    public void run() {
        table();
        if (isPrime()) {
            System.out.println(" Number is Prime");
        } else {
            System.out.println(" Number is not a Prime");
        }
    }

    public void table() {
        System.out.println(" Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + num + " X " + i + " = " + num * i);
        }
    }

    public boolean isPrime() {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Lab8 {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA(5);
        ThreadA t2 = new ThreadA(9);
        t1.start();
        t2.start();
    }
}
