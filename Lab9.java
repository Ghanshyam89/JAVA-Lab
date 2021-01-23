// WAP to achieve thread synchronization.

package Assignments;

class ThreadB extends Thread {
    int num;

    public ThreadB(int num) {
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

    synchronized public void table() {
        System.out.println(" Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + num + " X " + i + " = " + num * i);
        }
    }

    synchronized public boolean isPrime() {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Lab9 {
    public static void main(String[] args) {
        ThreadB t1 = new ThreadB(5);
        ThreadB t2 = new ThreadB(9);
        t1.start();
        t2.start();
    }
}
