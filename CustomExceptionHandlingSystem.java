package customExceptionHandlingSystem;

import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);
        CustomExceptionHandlingSystem obj = new CustomExceptionHandlingSystem();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            obj.checkNumber(number);
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}