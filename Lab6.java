// WAP to handle user define exception.

package Assignments;

class MyException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MyException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

public class Lab6 {
    public static void main(String[] args) {
        try {
            // Throw an object of user defined exception
            throw new MyException("User defined Exception");
        } catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}
