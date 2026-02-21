package customExceptionHandlingSystem;

// Custom Exception Class
class MyException extends Exception {

    MyException(String message) {
        super(message);
    }
}

public class CustomExceptionHandlingSystem {

    // Method that throws custom exception
    void checkNumber(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number cannot be negative!");
        } else {
            System.out.println("Number is valid: " + num);
        }
    }

    public static void main(String[] args) {

        CustomExceptionHandlingSystem obj = new CustomExceptionHandlingSystem();

        try {
            obj.checkNumber(15);
            obj.checkNumber(-3);  // This will throw exception
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}